package phase1;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.TimeZone;

public class VehicleOwner extends GarageUser {

    double fees;
    String VmodelName;
    int VmodelYear;
    double Vlength;
    double Vwidth;
    int VID;// The slot ID that the vehicle is parked in

    ArrayList<Integer> VehicleID = new ArrayList<Integer>();//Bec same owner might have many vehicles
    int hour1 = 0;
    int hour2 = 0;

    public void signup(String user, String pass, String e) {
        username = user;
        Password = pass;
        email = e;
    }

    public void login(String user, String p) {
        username = user;
        Password = p;
    }

    public void parkIn(int ID, ParkingSlot[] arr) {
        //loop over arr
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            //check if slot is available
            if (arr[i].flag == false) {
                //Compare dimensions
                if (arr[i].length >= Vlength && arr[i].width >= Vwidth) {
                    arr[i].flag = true;

                    //Increment totalVehicles in class total to calculate total vehicles
                    total.countVehicles();

                    VID = arr[i].slotID;
                    arr[i].parkedVehicleID = ID;//Now we know which vehicle is in which slot
                    System.out.println("Your vehicle is parked in slot number: " + arr[i].slotID);
                    VehicleID.add(ID); //Vehicle number (ID) is parked in and its ID is added to array of vehiclesID
                    found = true;

                    //Save parkIn time of this vehicle
                    Instant instant = Instant.now();
                    hour1 = instant.atZone(ZoneOffset.UTC).getHour();

                    break;
                }
            } else {
                continue;
            }
        }
        if (found == false) {
            System.out.println("No slot is available for you");
        }
    }

    public void parkOut(int myVechicleID, ParkingSlot[] arr) {
        //Check if this vehicle is parked in
        boolean parked = false;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].parkedVehicleID == myVechicleID) {
                parked = true;
                index = i;
            }
        }
        if (parked == false) {
            System.out.println("Sorry, this vehicle is not parked in our garage, Please enter a valid Vehicle ID");
        } else {
            arr[index].flag = false;//Now the slot is free because car is parked out
            //save park-out time
            Instant instant = Instant.now();
            hour2 = instant.atZone(ZoneOffset.UTC).getHour();

            //Calculate fees
            fees = 5 * (hour2 - hour1);
            System.out.println("Your vehicle is parked out successfuly, your fees are " + fees + "EGP");
        }
    }
}
