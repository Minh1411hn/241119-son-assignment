package src.main;

import src.dbconfig.Database;
import src.dbconfig.DatabaseFactory;
import src.dbconfig.DatabaseType;
import src.employees.Employee;
import src.employees.IEmployeeManagement;
import src.employees.IEmployeeManagementImpl;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Database db = DatabaseFactory.getInstance(DatabaseType.MYSQL);
        IEmployeeManagement empManager = new IEmployeeManagementImpl(db);

        // Display all employees
        System.out.println("All Employees:");
        List<Employee> employees = empManager.getEmployees();
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // Search for an employee by ID
        int empIDToSearch = 1;
        Employee foundEmployee = empManager.searchEmployeeById(empIDToSearch);
        if (foundEmployee != null) {
            System.out.println("\nEmployee with ID " + empIDToSearch + ":");
            System.out.println(foundEmployee);
        } else {
            System.out.println("\nEmployee with ID " + empIDToSearch + " not found.");
        }

        // Sort employees by salary and display the top 10 highest salaries
        System.out.println("\nTop 10 Highest Salaries:");
        List<Employee> top10Employees = empManager.getTop10HighestSalaries();
        for (Employee emp : top10Employees) {
            System.out.println(emp);
        }
    }
}