package BankManagementSystem;

public class Customer  extends Account{
  private int CustomerID;
  private String ContactNo;
  private String Email;

  public Customer(int accounNo, String name, int balance, int customerID, String contactNumber, String email, String address) {
    super(accounNo, name, balance);
    this.CustomerID = customerID;
    this.ContactNo = contactNumber;
    this.Email = email;
}

  public int getCustomerID() {
    return CustomerID;
  }

  public void setCustomerID(int customerID) {
    CustomerID = customerID;
  }

  public String getContactNo() {
    return ContactNo;
  }

  public void setContactNo(String contactNo) {
    ContactNo = contactNo;
  }

  public String getEmail() {
    return Email;
  }

  public void setEmail(String email) {
    Email = email;
  }

  void displayCustomerdetails(){
    super.BankStatement();
    System.out.println("Customer ID: " + CustomerID);
    System.out.println("Name: " + getName()); 
    System.out.println("Contact Number: " + ContactNo);
  }

}
