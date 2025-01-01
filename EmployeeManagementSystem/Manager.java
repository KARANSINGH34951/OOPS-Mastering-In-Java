package EmployeeManagementSystem;

class Manager extends Employee {
  private String[] teamMembers;

  
  public Manager(int empId, String name, String department, double salary, String[] teamMembers) {
      super(empId, name, department, salary); 
      this.teamMembers = teamMembers;
  }

  
  @Override
  public void displayDetails() {
      super.displayDetails(); 
      System.out.print("Team Members: ");
      for (String member : teamMembers) {
          System.out.print(member + " ");
      }
      System.out.println();
  }
}

