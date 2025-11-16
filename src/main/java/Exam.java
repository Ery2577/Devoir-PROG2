import java.time.LocalDateTime;

public class Exam {
    private int id;
    private String name;
    private Enseignant teacher;
    private Course course;
    private LocalDateTime examDate;
    private String description;
    private double coefficient;
    private int durationMinutes;

    // --- Full constructor ---
    public Exam(int id, String name, Enseignant teacher,
                LocalDateTime examDate, String description,
                double coefficient, int durationMinutes, Course course) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.examDate = examDate;
        this.description = description;
        this.coefficient = coefficient;
        this.durationMinutes = durationMinutes;
        this.course = course;
    }

    public Exam() {
    }

    // --- Getters ---
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Enseignant getTeacher() {
        return teacher;
    }

    public Course getCourse() {
        return course;
    }

    public LocalDateTime getExamDate() {
        return examDate;
    }

    public String getDescription() {
        return description;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    // --- Setters ---
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacher(Enseignant teacher) {
        this.teacher = teacher;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setExamDate(LocalDateTime examDate) {
        this.examDate = examDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

}
