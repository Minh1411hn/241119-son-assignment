package src.employees;

import java.util.List;

public interface IEmployeeManagement {

    List<Employee> getEmployees();

    Employee getEmployee(int empID);

    Employee searchEmployeeById(int empID);

    List<Employee> sortEmployeesBySalary();

    List<Employee> sortEmployeesBySalary(String direction);

    List<Employee> getTop10HighestSalaries();
}
