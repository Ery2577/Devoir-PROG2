import java.time.Instant;

public class HistoryEntry {
    private double value;
    private Instant date;
    private String reason;

    public HistoryEntry(double value, Instant date, String reason) {
        this.value = value;
        this.date = date;
        this.reason = reason;
    }

    public double getValue() {
        return value;
    }

    public Instant getDate() {
        return date;
    }

    public String getReason() {
        return reason;
    }
}
