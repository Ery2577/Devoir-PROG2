import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeServiceTest {
    @Test
    public void testGetCourseGrade() {

        Etudiant student = new Etudiant();
        Course course = new Course(1, "PROG2", 4, null);

        Exam e1 = new Exam();
        e1.setCourse(course);
        e1.setCoefficient(2);

        Exam e2 = new Exam();
        e2.setCourse(course);
        e2.setCoefficient(3);

        Grade g1 = new Grade(student, e1);
        Grade g2 = new Grade(student, e2);

        Instant t = Instant.parse("2024-01-01T10:00:00Z");

        g1.addHistory(10, t, "Exam 1");
        g2.addHistory(15, t, "Exam 2");

        GradeService service = new GradeService(java.util.List.of(g1, g2));

        double result = service.getCourseGrade(course, student, t);

        assertEquals(13.0, result); // (10*2 + 15*3) / 5
    }

}
