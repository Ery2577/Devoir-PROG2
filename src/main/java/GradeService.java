import java.time.Instant;
import java.util.List;

public record GradeService(List<Grade> grades) {

    public double getExamGrade(Exam exam, Etudiant student, Instant t) {
        Grade grade = grades.stream()
                .filter(g -> g.getExam().equals(exam) && g.getStudent().equals(student))
                .findFirst()
                .orElse(null);

        if (grade == null) return 0.0;

        return grade.getHistory().stream()
                .filter(h -> !h.getDate().isAfter(t))
                .sorted((a, b) -> b.getDate().compareTo(a.getDate()))
                .map(HistoryEntry::getValue)
                .findFirst()
                .orElse(0.0);
    }

    public double getCourseGrade(Course course, Etudiant student, Instant t) {

        var examGrades = grades.stream()
                .filter(g -> g.getExam().getCourse().equals(course)
                        && g.getStudent().equals(student))
                .toList();

        if (examGrades.isEmpty()) return 0.0;

        double totalWeighted = 0.0;
        double totalCoeff = 0.0;

        for (Grade g : examGrades) {
            double value = getExamGrade(g.getExam(), student, t);
            double coeff = g.getExam().getCoefficient();

            totalWeighted += value * coeff;
            totalCoeff += coeff;
        }

        return totalCoeff == 0 ? 0.0 : totalWeighted / totalCoeff;
    }
}
