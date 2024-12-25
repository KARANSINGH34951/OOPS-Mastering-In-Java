public class ChargesCalculator extends VehicleParking{
  // private int NoofHours;
  private static final int FixRatePerHour=20;
  public int TotalCharges;

  // public ChargesCalculator(int ) {
  //   this.NoofHours = noofHours;
  // }

  void ChargersCalculation(int noofHours){
    this.TotalCharges=noofHours*FixRatePerHour;
  }

  void showTotalCharges(){
    System.out.println("Your Total charge is :"+ this.TotalCharges);
  }
}
