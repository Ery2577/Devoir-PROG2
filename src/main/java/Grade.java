import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Grade {
    private Etudiant student;
    private Exam exam;
    private List<HistoryEntry> history;

    public Grade (Etudiant student, Exam exam){
        this.student = student;
        this.exam = exam;
        this.history = new ArrayList<>();
    }

    public  void addHistory (double value, Instant date, String reason){
        this.history.add(new HistoryEntry(value, date, reason));
    }

    public List<HistoryEntry>   getHistory(){
        return history;
    }

    public Etudiant getStudent() {
        return student;
    }

    public Exam getExam() {
        return exam;
    }
}
