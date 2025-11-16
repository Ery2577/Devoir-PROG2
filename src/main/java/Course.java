

public class Course {
    private int id;
    private String label;
    private int credits;
    private Enseignant teacher;

    public Course(int id, String label, int credits, Enseignant teacher) {
        this.id = id;
        this.label = label;
        this.credits = credits;
        this.teacher = teacher;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Enseignant getTeacher() {
        return teacher;
    }

    public void setTeacher(Enseignant teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Course {" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", credits=" + credits +
                ", teacher=" + teacher +
                '}';
    }
}
