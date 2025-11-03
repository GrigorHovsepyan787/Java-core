package homework.employee;

public interface CommandsEmp {
    String EXIT = "0";
    String ADD = "1";
    String PRINT = "2";
    String SEARCH_ID = "3";
    String SEARCH_COM = "4";
    String SEARCH_POS = "5";
    String POS_JUNIOR = "1";
    String POS_MIDDLE = "2";
    String POS_SENIOR = "3";
    String POS_LEAD = "4";

    static void printCommands() {
        System.out.println("Input " + EXIT + " to exit");
        System.out.println("Input " + ADD + " to add employee");
        System.out.println("Input " + PRINT + " to print all employees");
        System.out.println("Input " + SEARCH_ID + " to search employee by ID");
        System.out.println("Input " + SEARCH_COM + " to search employees of company");
        System.out.println("Input " + SEARCH_POS + " to search employees of position");
    }

    static void printPos(){
        System.out.println("Input " + POS_JUNIOR + " for junior level");
        System.out.println("Input " + POS_MIDDLE + " for middle level");
        System.out.println("Input " + POS_SENIOR + " for senior level");
        System.out.println("Input " + POS_LEAD + " for lead level");
    }
}
