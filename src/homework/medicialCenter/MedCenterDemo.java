package homework.medicialCenter;

import homework.medicialCenter.doctor.Doctor;
import homework.medicialCenter.doctor.DoctorStorage;
import homework.medicialCenter.patient.Patient;
import homework.medicialCenter.patient.PatientStorage;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import static homework.medicialCenter.Professions.*;

public class MedCenterDemo implements CommandsMed {
    private static final Scanner scan = new Scanner(System.in);
    private static final DoctorStorage doctorStorage = new DoctorStorage();
    private static final PatientStorage patientStorage = new PatientStorage();
    private static boolean isRun;

    public static void main(String[] args) {
        isRun = true;
        while (isRun) {
            CommandsMed.printCommands();
            String command = scan.nextLine();
            switch (command) {
                case EXIT -> exit();
                case ADD_DOC -> addDoc();
                case SEARCH_PROF -> searchDoc();
                case DELETE_ID -> deleteDoc();
                case CHANGE_BY_ID -> changeDoc();
                case ADD_PATIENT -> addPatient();
                case PRINT_PATIENTS_BY_DOC -> printDocPatients();
                case PRINT_PATIENTS -> printAllPatients();
            }
        }
    }

    private static void exit() {
        System.out.println("Exiting the program");
        isRun = false;
    }

    private static void addDoc() {
        try {
            System.out.println("Input Doctor id");
            int id = scan.nextInt();
            if (doctorStorage.isIdBusy(id) || patientStorage.isIdBusy(id)) {
                System.err.println("Id is busy!");
                return;
            }
            System.out.println("Input Doctor name");
            String name = scan.nextLine();
            System.out.println("Input Doctor surname");
            String surname = scan.nextLine();
            System.out.println("Input Doctor email");
            String email = scan.nextLine();
            if (doctorStorage.isEmailBusy(email)) {
                System.err.println("Email is busy!");
                return;
            }
            System.out.println("Input Doctor phone number");
            int phoneNum = scan.nextInt();
            if (doctorStorage.isNumBusy(phoneNum) || patientStorage.isNumBusy(phoneNum)) {
                System.err.println("phone number is busy!");
                return;
            }
            System.out.println("Choose doctors profession");
            CommandsMed.printProf();
            String profession = scan.nextLine();
            if (professionCheck(profession) == null) {
                System.err.println("Incorrect profession");
                return;
            }
            Doctor doctor = new Doctor(id, name, surname, email, phoneNum, professionCheck(profession));
            doctorStorage.add(doctor);
            System.out.println("Doctor has been successfully added!");

        } catch (InputMismatchException e) {
            System.err.println("Invalid value for number/id");
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }

    private static Professions professionCheck(String i) {
        switch (i) {
            case FAM_DOC_INT -> {
                return FAM_DOC;
            }
            case INTERNIST_INT -> {
                return INTERNIST;
            }
            case PEDIATRICIAN_INT -> {
                return PEDIATRICIAN;
            }
            case SURGEON_INT -> {
                return SURGEON;
            }
            case PSYCHIATRIST_INT -> {
                return PSYCHIATRIST;
            }
            case DERMATOLOGIST_INT -> {
                return DERMATOLOGIST;
            }
            default -> {
                return null;
            }
        }
    }

    private static void searchDoc() {
        System.out.println("Choose the profession");
        CommandsMed.printProf();

        String profession = scan.nextLine();
        if (professionCheck(profession) == null) {
            System.err.println("Incorrect profession");
            return;
        }
        doctorStorage.searchByProf(professionCheck(profession));
    }

    private static void deleteDoc() {
        System.out.println("Input the id");
        int id = scan.nextInt();
        doctorStorage.deleteById(id);
    }

    private static void changeDoc() {
        System.out.println("Input the id");
        int id = scan.nextInt();
        if (doctorStorage.searchById(id) == null) {
            System.err.println("Couldn't find any doctor with that id");
            return;
        }
        Doctor doctor = doctorStorage.searchById(id);
        System.out.println("Choose what you want to change");
        CommandsMed.printSet();
        String command = scan.nextLine();
        switch (command) {
            case SET_NAME -> {
                System.out.println("Input new name");
                String name = scan.nextLine();
                doctor.setName(name);
            }
            case SET_SURNAME -> {
                System.out.println("Input new surname");
                String surname = scan.nextLine();
                doctor.setSurname(surname);
            }
            case SET_EMAIL -> {
                System.out.println("Input new email");
                String email = scan.nextLine();
                if (doctorStorage.isEmailBusy(email)) {
                    System.err.println("Email is busy!");
                    return;
                }
                doctor.setEmail(email);
            }
            case SET_PHONE_NUMBER -> {
                try {
                    System.out.println("Input new phone number");
                    int number = scan.nextInt();
                    if (doctorStorage.isNumBusy(number) || patientStorage.isNumBusy(number)) {
                        System.err.println("phone number is busy!");
                        return;
                    }
                    doctor.setPhoneNumber(number);
                } catch (RuntimeException e) {
                    System.err.println(e.getMessage());
                }
            }
            case SET_PROFESSION -> {
                System.out.println("Choose new profession");
                CommandsMed.printProf();
                String profession = scan.nextLine();
                if (professionCheck(profession) == null) {
                    System.err.println("incorrect position");
                    return;
                }
                doctor.setProfession(professionCheck(profession));
            }
            default -> System.err.println("incorrect command");
        }
    }

    private static void addPatient() {
        try {
            System.out.println("Input Patient id");
            int id = scan.nextInt();
            if (patientStorage.isIdBusy(id) || doctorStorage.isIdBusy(id)) {
                System.err.println("Id is busy!");
                return;
            }
            System.out.println("Input Patient name");
            String name = scan.nextLine();
            System.out.println("Input Patient surname");
            String surname = scan.nextLine();
            System.out.println("Input Patient phone number");
            int number = scan.nextInt();
            if (doctorStorage.isNumBusy(number) || patientStorage.isNumBusy(number)) {
                System.err.println("Phone number is busy");
                return;
            }
            System.out.println("Input Patient Doctors id");
            int docId = scan.nextInt();
            Date date = new Date();
            Patient patient = new Patient(id, name, surname, number, doctorStorage.searchById(docId), date);
            patientStorage.add(patient);
            System.out.println("Patient has been successfully added!");
        } catch (InputMismatchException e) {
            System.err.println("Invalid value for number/id");
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void printDocPatients() {
        if (patientStorage.getSize() == 0) {
            System.err.println("No patients!");
            return;
        }
        System.out.println("Input Doctor id");
        int id = scan.nextInt();
        if (doctorStorage.searchById(id) == null) {
            System.err.println("Incorrect Doctor id");
        }
        patientStorage.printDoc(doctorStorage.searchById(id));
    }

    private static void printAllPatients() {
        if (patientStorage.getSize() == 0) {
            System.err.println("No patients!");
            return;
        }
        patientStorage.print();
    }
}

