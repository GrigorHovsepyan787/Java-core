package homework.medicialCenter;

public interface CommandsMed {
    String EXIT = "0";
    String ADD_DOC = "1";
    String SEARCH_PROF = "2";
    String DELETE_ID = "3";
    String CHANGE_BY_ID = "4";
    String ADD_PATIENT = "5";
    String PRINT_PATIENTS_BY_DOC = "6";
    String PRINT_PATIENTS = "7";
    String SET_NAME = "1";
    String SET_SURNAME = "2";
    String SET_EMAIL = "3";
    String SET_PHONE_NUMBER = "4";
    String SET_PROFESSION = "5";
    String FAM_DOC_INT = "1";
    String INTERNIST_INT = "2";
    String PEDIATRICIAN_INT = "3";
    String SURGEON_INT = "4";
    String PSYCHIATRIST_INT = "5";
    String DERMATOLOGIST_INT = "6";

    static void printCommands() {
        System.out.println("Input " + EXIT + " to exit");
        System.out.println("Input " + ADD_DOC + " to add doctor");
        System.out.println("Input " + SEARCH_PROF + " to search doctor by profession");
        System.out.println("Input " + DELETE_ID + " to delete doctor by id");
        System.out.println("Input " + CHANGE_BY_ID + " to change doctor  by id");
        System.out.println("Input " + ADD_PATIENT + " to add patient");
        System.out.println("Input " + PRINT_PATIENTS_BY_DOC + " to print all patients by doctor");
        System.out.println("Input " + PRINT_PATIENTS + " to print all patients");
    }

    static void printProf() {
        System.out.println("Input " + FAM_DOC_INT + " for Family Medicine Doctor");
        System.out.println("Input " + INTERNIST_INT + " for Internist");
        System.out.println("Input " + PEDIATRICIAN_INT + " for Pediatrician");
        System.out.println("Input " + SURGEON_INT + " for Surgeon");
        System.out.println("Input " + PSYCHIATRIST_INT + " for Psychiatrist");
        System.out.println("Input " + DERMATOLOGIST_INT + " for Dermatologist");
    }

    static void printSet() {
        System.out.println("Input " + SET_NAME + " to change the name");
        System.out.println("Input " + SET_SURNAME + " to change the surname");
        System.out.println("Input " + SET_EMAIL + " to change the email");
        System.out.println("Input " + SET_PHONE_NUMBER + " to change the phone number");
        System.out.println("Input " + SET_PROFESSION + " to change the profession");
    }
}
