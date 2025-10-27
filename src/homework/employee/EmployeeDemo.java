package homework.employee;

import java.util.Scanner;

public class EmployeeDemo implements CommandsEmp {
    private static final Scanner scan = new Scanner(System.in);
    private static final EmployeeStorage employeeStorage = new EmployeeStorage();
    private static boolean isRun;
    public static void main(String[] args) {
        isRun = true;
        while (isRun){
            CommandsEmp.printCommands();
            String command = scan.nextLine();
            switch (command) {
                case EXIT -> exit();
                case ADD -> addEmployee();
                case PRINT -> printAllEmployee();
                case SEARCH_ID -> searchID();
                case SEARCH_COM -> searchCom();
                default -> System.err.println("Wrong command!!!");
            }
        }
    }
    private static void exit(){
        System.out.println("Exiting the program");
        isRun = false;
    }
    private static void addEmployee() {
        try {
            System.out.println("Input employee name");
            String employeeName = scan.nextLine();
            System.out.println("Input employee surname");
            String employeeSurname = scan.nextLine();
            System.out.println("Input employee ID");
            String employeeID = scan.nextLine();
            if (!employeeStorage.isIdBusy(employeeID)) {
                System.out.println("Input employee salary");
                Double employeeSalary = scan.nextDouble();
                System.out.println("Input the company of employee");
                String employeeCom = scan.nextLine();
                System.out.println("Input employee position");
                String employeePos = scan.nextLine();
                Employee emp = new Employee(employeeName, employeeSurname, employeeID, employeeSalary, employeeCom, employeePos);
                employeeStorage.add(emp);
                System.out.println("Employee has been successfully added!");
            } else {
                System.out.println("Id is already busy!");
            }
        }
        catch (java.util.InputMismatchException e){
            System.err.println("Wrong value for double");
        }
    }

    private static void printAllEmployee() {
        if (employeeStorage.getSize() == 0) {
            System.err.println("No employees!");
        } else {
            employeeStorage.print();
        }
    }

    private static void searchID() {
        if (employeeStorage.getSize() == 0) {
            System.err.println("No employees!");
        } else {
            System.out.println("Input ID");
            String keyword = scan.nextLine();
            employeeStorage.searchById(keyword);
        }
    }

    private static void searchCom() {
        if (employeeStorage.getSize() == 0) {
            System.err.println("No employees!");
        } else {
            System.out.println("Input company");
            String keyword = scan.nextLine();
            employeeStorage.searchByComName(keyword);
        }
    }
}
