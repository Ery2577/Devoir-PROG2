import java.util.List;

public class Promotion {
    private int id;
    private String label;
    private List<Group> groups;

    public Promotion(int id, String label, List<Group> groups) {
        this.id = id;
        this.label = label;
        this.groups = groups;
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

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Promotion {" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", groups=" + groups +
                '}';
    }
}
