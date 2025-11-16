// package models;

import java.time.LocalDate;

public class Etudiant {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String email;
    private String phone;
    private String tutor;

    public Etudiant (int id, String firstName, String lastName, LocalDate birthDate,
                     String email, String phone, String tutor){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email  = email;
        this.phone = phone;
        this.tutor = tutor;
    }

    public  Etudiant() {}

    // GETTERS
    public int getId(){
        return  id;
    }

    public String getFirstName (){
        return  firstName;
    }

    public String getLastName(){
        return  lastName;
    }

    public LocalDate getBirthDate (){
        return birthDate;
    }

    public  String getEmail(){
        return email;
    }

    public String getPhone (){
        return phone;
    }

    public String getTutor (){
        return tutor;
    }


    // SETTERS
    public void setId (int id){
        this.id = id;
    }

    public void setFirstName (String firstName){
        this.firstName = firstName;

    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setBirthDate (LocalDate birthDate){
        this.birthDate = birthDate;
    }

    public  void setEmail (String email){
        this.email = email;
    }

    public void setPhone (String phone){
        this.phone = phone;
    }

    public  void setTutor (String tutor){
        this.tutor = tutor;
    }


    // Posts models
    @Override
    public String toString () {
        return "Etudiant{" +
                "ID : " + id + "/" +
                ", First Name : " + firstName + "/" +
                ", Last Name : " + lastName + "/" +
                ", Birth Date : " + birthDate + "/" +
                ", Email : " + email + "/" +
                ", Phone : " + phone + "/" +
                ", Tutor : " + tutor + "/" +
                '}';
    }

}

