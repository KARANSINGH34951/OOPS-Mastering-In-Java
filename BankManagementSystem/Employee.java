package BankManagementSystem;

public class Employee extends Account {
    private int EmployeeID;
    private double EmployeeSalary;

    public Employee(int accounNo, String name, int balance, int employeeID, double employeeSalary) {
        super(accounNo, name, balance);
        EmployeeID = employeeID;
        EmployeeSalary = employeeSalary;
    }

    public void payEmployeeSalary(int salaryAmount) {
        deposit(salaryAmount);
        System.out.println("Salary credited: " + salaryAmount);
    }

    public void displayEmployeeDetails() {
        super.BankStatement();
        System.out.println("Employee ID: " + EmployeeID);
        System.out.println("Employee Salary: " + EmployeeSalary);
        System.out.println("Works in XYZ department.");
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public double getEmployeeSalary() {
        return EmployeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        EmployeeSalary = employeeSalary;
    }
}
