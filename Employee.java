import java.util.*;

class Employee {
    private int employeeId;
    private String name;

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "ID: " + employeeId + ", Name: " + name;
    }

    // TO-DO: Implement equals()
    // An employee is equal to another if their employeeId is the same.
    @Override
    public boolean equals(Object o) {//Two Employee objects are equal if their employeeId is the same.
        if (this == o) return true; // Check if same object reference

        if (o == null || getClass() != o.getClass()) return false;//If the other object is null or not an Employee

        Employee employee = (Employee) o;

        return employeeId == employee.employeeId; // Compare employeeId
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(employeeId);
    }
}

class HRSystem {
    public static void main(String[] args) {
        HRSystem hrSystem = new HRSystem();

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice"),
                new Employee(2, "Bob"),
                new Employee(1, "Alice") //duplicate by ID
        );

        Set<Employee> uniqueEmployees = hrSystem.deduplicateEmployees(employees);

        System.out.println("Unique employees: " + uniqueEmployees);
    }
    /*
     * TO-DO: Return a Set containing unique employees from the input list.
     * This will only work correctly if Employee.equals() and Employee.hashCode() are implemented properly.
     * @param allEmployees A list that may contain duplicate employee records.
     * @return A Set of unique Employee objects.
     */
    public Set<Employee> deduplicateEmployees(List<Employee> allEmployees) {
        return new HashSet<>(allEmployees);//convert the list to HashSet
    }
}