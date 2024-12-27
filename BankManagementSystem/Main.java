package BankManagementSystem;

public class Main {
    public static void main(String[] args) {       
        Employee userobj = new Employee(234, "Karan", 230000, 101, 2000);
        
        userobj.displayEmployeeDetails();

        userobj.payEmployeeSalary(5000);
        System.out.println("After Salary Payment:");
        userobj.displayEmployeeDetails();
    }
}
