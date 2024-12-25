import java.util.HashSet;
import java.util.Set;

public class VehicleParking {
    private int totalSpots = 4;
    private int occupiedSpots = 0;
    private Set<Integer> parkedVehicles = new HashSet<>(); 
    public VehicleParking() {}

   
    public void addVehicle(int vehicleNo) {
        if (occupiedSpots < totalSpots) {
            if (parkedVehicles.contains(vehicleNo)) {
                System.out.println("Vehicle " + vehicleNo + " is already parked.");
            } else {
                parkedVehicles.add(vehicleNo);
                occupiedSpots++;
                System.out.println("Vehicle " + vehicleNo + " parked successfully.");
            }
        } else {
            System.out.println("Parking lot is full! Vehicle " + vehicleNo + " cannot be parked.");
        }
    }

 
    public void removeVehicle(int vehicleNo) {
        if (occupiedSpots > 0 && parkedVehicles.contains(vehicleNo)) {
            parkedVehicles.remove(vehicleNo);
            occupiedSpots--;
            System.out.println("Vehicle " + vehicleNo + " removed successfully.");
        } else {
            System.out.println("Vehicle " + vehicleNo + " is not in the parking lot.");
        }
    }

    
    public void viewStatus() {
        System.out.println("Total Spots: " + totalSpots);
        System.out.println("Occupied Spots: " + occupiedSpots);
        System.out.println("Available Spots: " + (totalSpots - occupiedSpots));
        System.out.println("Parked Vehicles: " + parkedVehicles);
    }
}
