import java.time.LocalDate;

public class Tutor {
    private int id;
    private String lastName;
    private String firstName;
    private LocalDate birthDate;
    private String email;
    private String phone;
    private String descriptionLink;

    public  Tutor (int id, String lastName, String firstName, LocalDate birthDate, String email, String phone, String descriptionLink){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.descriptionLink = descriptionLink;
    }

    public Tutor(){}

    // SETTERS
    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDescriptionLink(String descriptionLink) {
        this.descriptionLink = descriptionLink;
    }

    // GETTERS

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return  email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDescriptionLink() {
        return descriptionLink;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "id :" + id +
                ", nom :" + lastName + '\'' +
                ", prenom : " + firstName + '\'' +
                ", dateNaissance : " + birthDate +
                ", email :" + email + '\'' +
                ", telephone :" + phone + '\'' +
                ", descriptionLien :" + descriptionLink + '\'' +
                '}';
    }
}
