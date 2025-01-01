package EmployeeManagementSystem;

class Employee {
  
  private int empId;
  private String name;
  private String department;
  private double salary;


  public Employee(int empId, String name, String department, double salary) {
      this.empId = empId;
      this.name = name;
      this.department = department;
      this.salary = salary;
  }


  public int getEmpId() {
      return empId;
  }

  public String getName() {
      return name;
  }

  public String getDepartment() {
      return department;
  }

  public void setDepartment(String department) {
      this.department = department;
  }

  public double getSalary() {
      return salary;
  }

  public void setSalary(double salary) {
      this.salary = salary;
  }

 
  public void displayDetails() {
      System.out.println("ID: " + empId + ", Name: " + name + ", Department: " + department + ", Salary: " + salary);
  }
}
