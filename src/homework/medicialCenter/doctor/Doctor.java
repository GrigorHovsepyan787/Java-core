package homework.medicialCenter.doctor;

import homework.medicialCenter.Person;
import homework.medicialCenter.Professions;

import java.util.Objects;

public class Doctor extends Person {
    private String email;
    private Professions profession;

    public Doctor(int id, String name, String surname, String email, int phoneNumber, Professions profession) {
        this.id = id;
        if (id <= 0) {
            throw new RuntimeException("Incorrect value for id!");
        }
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        if (phoneNumber <= 0) {
            throw new RuntimeException("Incorrect value for phone number!");
        }
        this.profession = profession;
    }

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        if (phoneNumber <= 0) {
            throw new RuntimeException("Incorrect value for phone number!");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Professions getProfession() {
        return profession;
    }

    public void setProfession(Professions profession) {
        this.profession = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return id == doctor.id && phoneNumber == doctor.phoneNumber && Objects.equals(name, doctor.name) && Objects.equals(surname, doctor.surname) && Objects.equals(email, doctor.email) && profession == doctor.profession;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, phoneNumber, email, profession);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", profession=" + profession +
                '}';
    }
}
