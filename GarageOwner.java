package phase1;

public class GarageOwner extends GarageUser {

    String AdminUsername;

    @Override
    public void login(String e, String p) {
        AdminUsername = e;
        Password = p;
    }

    @Override
    public void signup(String user, String pass, String e) {
        AdminUsername = user;
        Password = pass;
        email = e;
    }

    public void displayAvailableSlots(ParkingSlot[] arr) {
        System.out.println("Available slots are:\n");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].flag == false) {
                System.out.println("Slot ID: " + arr[i].slotID + ", Length: " + arr[i].length + ", Width: " + arr[i].width + "\n");

            }
        }
    }

    //Display total vehicles and total income
    public void printTotalVehicles() {
        System.out.println("Total Number of Vehicles that have used the garage is:" + total.totalVehicles + " Vehicles");
    }

    public void printTotalIncome() {
        System.out.println("Total income of the garage =:" + total.totalIncome + "EGP");
    }

}
