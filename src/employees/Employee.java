package src.employees;

public class Employee {
    private int empID;
    private String empFullName;
    private String empEmail;
    private float empSalary;
    private String empStartDate;
    private String empEndDate;

    // Constructor
    public Employee(int empID, String empFullName, String empEmail, float empSalary, String empStartDate, String empEndDate) {
        this.empID = empID;
        this.empFullName = empFullName;
        this.empEmail = empEmail;
        this.empSalary = empSalary;
        this.empStartDate = empStartDate;
        this.empEndDate = empEndDate;
    }

    // Getters and Setters
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpFullName() {
        return empFullName;
    }

    public void setEmpFullName(String empFullName) {
        this.empFullName = empFullName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(float empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpStartDate() {
        return empStartDate;
    }

    public void setEmpStartDate(String empStartDate) {
        this.empStartDate = empStartDate;
    }

    public String getEmpEndDate() {
        return empEndDate;
    }

    public void setEmpEndDate(String empEndDate) {
        this.empEndDate = empEndDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", empFullName='" + empFullName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empSalary=" + empSalary +
                ", empStartDate='" + empStartDate + '\'' +
                ", empEndDate='" + empEndDate + '\'' +
                '}';
    }
}