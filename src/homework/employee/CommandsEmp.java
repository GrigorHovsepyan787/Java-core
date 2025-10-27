package homework.employee;

public interface CommandsEmp {
    String EXIT = "0";
    String ADD = "1";
    String PRINT = "2";
    String SEARCH_ID = "3";
    String SEARCH_COM = "4";

    static void printCommands() {
        System.out.println("Input " + EXIT + " to exit");
        System.out.println("Input " + ADD + " to add employee");
        System.out.println("Input " + PRINT + " to print all employees");
        System.out.println("Input " + SEARCH_ID + " to search employee by ID");
        System.out.println("Input " + SEARCH_COM + " to search employees of company");
    }
}
