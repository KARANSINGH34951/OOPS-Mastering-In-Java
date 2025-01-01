package EmployeeManagementSystem;

public class EmployeeManagement {
  public static void main(String[] args) {
      
      Employee emp1 = new Employee(101, "karan singh", "HR", 50000);
      Employee emp2 = new Employee(102, "rahul", "Finance", 60000);

      
      String[] team = {"preti", "neha", "ashish"};
      Manager mgr = new Manager(201, "manish", "IT", 80000, team);

      
      System.out.println("Employee Details:");
      emp1.displayDetails();
      emp2.displayDetails();

      System.out.println("\nManager Details:");
      mgr.displayDetails();
  }
}
