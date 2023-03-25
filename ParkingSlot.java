package phase1;

public class ParkingSlot {

    double length;
    double width;
    int slotID;
    int parkedVehicleID;
    boolean flag = false;//if slot has a vehicle in it --> flag = true, else equal false

    ParkingSlot(double l, double w, int ID) {
        length = l;
        width = w;
        slotID = ID;
    }
}
