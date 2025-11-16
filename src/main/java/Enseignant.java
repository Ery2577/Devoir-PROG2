import  java.time.LocalDate;

public class Enseignant {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String email;
    private String phone;
    private String specialty;

    public Enseignant(int id, String firstName, String lastName, LocalDate birthDate, String email, String phone, String specialty) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.specialty = specialty;
    }

    public Enseignant() {
    }

    // GETTERS
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

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

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public String toString() {
        return "Enseigant{" +
                "ID : " + id + "/" +
                ", First Name : " + firstName + "/" +
                ", Last Name : " + lastName + "/" +
                ", Birth Date : " + birthDate + "/" +
                ", Email : " + email + "/" +
                ", Phone : " + phone + "/" +
                '}';
    }
}