import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Assume the Employee class from Question 1 is available and correctly implemented.

class AnalyticsDashboard {

    public static void main(String[] args) {
        Employee firstActive = new Employee(1, "Alice");
        Employee firstUnActive = new Employee(2, "Bob");
        Employee secondActive = new Employee(3, "Charlie");
        Employee secondUnActive = new Employee(4, "Diana");

        List<Employee> allUsers = Arrays.asList(firstActive, firstUnActive, secondActive, secondUnActive);
        List<Employee> activeUsers = Arrays.asList(firstActive, secondActive);

        AnalyticsDashboard dashboard = new AnalyticsDashboard();
        Set<Employee> inactiveUsers = dashboard.findInactiveUsers(allUsers, activeUsers);

        System.out.println("Inactive Users:");
        for (Employee e : inactiveUsers) {
            System.out.println(e);
        }
    }
    /**
     * TO-DO: Find all users that are in the 'allUsers' list but NOT in the 'activeUsers' list.
     * Use HashSets for an efficient implementation.
     \*
     * @param allUsers A list of all registered Employee objects.
     * @param activeUsers A list of recently active Employee objects.
     * @return A Set of inactive Employee objects.
     */
    public Set<Employee> findInactiveUsers(List<Employee> allUsers, List<Employee> activeUsers) {
        // 1. Convert both lists to HashSets.
        Set<Employee> allEmployees = new HashSet<>(allUsers);
        Set<Employee> allActiveUsers = new HashSet<>(activeUsers);

        // 2. Perform the set difference operation.
        allEmployees.removeAll(allActiveUsers);

        // 3. Return the resulting set.
        return allEmployees; // Placeholder
    }
}