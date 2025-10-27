package homework.employee;

public class EmployeeStorage {
    private Employee[] employees = new Employee[0];
    private int size = 0;

    public void add(Employee employee) {
        if (size > employees.length - 1) {
            extend();
        }
        employees[size++] = employee;
    }

    public int getSize() {
        return employees.length;
    }

    private void extend() {
        Employee[] tmp = new Employee[size + 1];
        System.arraycopy(employees, 0, tmp, 0, employees.length);
        employees = tmp;
    }

    public void print() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void searchById(String keyword) {
        boolean isTrue = false;
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equalsIgnoreCase(keyword)) {
                isTrue = true;
                System.out.println(employee);
            }
        }
        if (!isTrue) {
            System.out.println("Couldn't find any employee by this ID");
        }
    }
    public boolean isIdBusy(String id){
        for (Employee employee : employees) {
            if(employee.getEmployeeId().equals(id)){
                return true;
            }
        }
        return false;
    }
    public void searchByComName(String keyword) {
        boolean isTrue = false;
        for (Employee employee : employees) {
            if (employee.getCompany().equalsIgnoreCase(keyword)) {
                isTrue = true;
                System.out.println(employee);
            }
        }
        if (!isTrue) {
            System.out.println("Couldn't find any employee of this company");
        }
    }
}
