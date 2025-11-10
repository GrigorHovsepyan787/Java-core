package homework.medicialCenter.patient;

import homework.medicialCenter.Person;
import homework.medicialCenter.doctor.Doctor;

import java.util.Date;
import java.util.Objects;

public class Patient extends Person {
    ;
    private Doctor doctor;
    private Date regDate;

    public Patient(int id, String name, String surname, int phoneNumber, Doctor doctor, Date regDate) {
        this.id = id;
        if (id <= 0) {
            throw new RuntimeException("Incorrect id value");
        }
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        if (phoneNumber <= 0) {
            throw new RuntimeException("Incorrect phone number value");
        }
        this.doctor = doctor;
        this.regDate = regDate;
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
        this.phoneNumber = phoneNumber;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return id == patient.id && phoneNumber == patient.phoneNumber && Objects.equals(name, patient.name) && Objects.equals(surname, patient.surname) && Objects.equals(doctor, patient.doctor) && Objects.equals(regDate, patient.regDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, phoneNumber, doctor, regDate);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", doctor=" + doctor +
                ", regDate=" + regDate +
                '}';
    }
}
