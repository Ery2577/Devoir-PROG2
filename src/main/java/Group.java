
import java.util.ArrayList;
import java.util.List;

public class Group {
    private int id;
    private String name;
    private List<Etudiant> students;

    // Constructor
    public Group(int id, String name) {
        this.id = id;
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Etudiant> getStudents() {
        return students;
    }

    // Methods to add or remove students
    public void addStudent(Etudiant student) {
        this.students.add(student);
    }

    public void removeStudent(Etudiant student) {
        this.students.remove(student);
    }

    @Override
    public String toString() {
        return "Group {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studentsCount=" + students.size() +
                '}';
    }
}
