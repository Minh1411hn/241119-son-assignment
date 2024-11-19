package src.employees;

import src.dbconfig.Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IEmployeeManagementImpl implements IEmployeeManagement {
    private List<Employee> employeeList;
    private Database db;
    private Connection conn;

    public IEmployeeManagementImpl(Database db) {
        this.db = db;
        this.conn = db.connect();
    }

    @Override
    public List<Employee> getEmployees() {
        employeeList = new ArrayList<>();
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM Employees");
            while (rs.next()) {
                Employee employee = new Employee(
                        rs.getInt("empID"),
                        rs.getString("empFullName"),
                        rs.getString("empEmail"),
                        rs.getFloat("empSalary"),
                        rs.getString("empStartDate"),
                        rs.getString("empEndDate")
                );
                employeeList.add(employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public Employee getEmployee(int empID) {
        for (Employee emp : getEmployees()) {
            if (emp.getEmpID() == empID) return emp;
        }
        return null;
    }

    @Override
    public Employee searchEmployeeById(int empID) {
        return getEmployee(empID);
    }

    @Override
    public List<Employee> sortEmployeesBySalary() {
        return List.of();
    }

    @Override
    public List<Employee> sortEmployeesBySalary(String direction) {
        List<Employee> employees = getEmployees();
        Comparator<Employee> comparator = Comparator.comparing(Employee::getEmpSalary);

        if (direction.equalsIgnoreCase("desc")) {
            comparator = comparator.reversed();
        }

        employees.sort(comparator);
        return employees;
    }

    @Override
    public List<Employee> getTop10HighestSalaries() {
        List<Employee> sortedEmployees = sortEmployeesBySalary("desc");
        return sortedEmployees.subList(0, Math.min(10, sortedEmployees.size()));
}}
