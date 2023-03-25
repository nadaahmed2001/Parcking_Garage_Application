package phase1;

import java.util.Scanner;
import java.io.IOException;


public class Controller {

    public static void main(String[] args) throws IOException {
        VehicleOwner v1 = new VehicleOwner();
        GarageOwner G1 = new GarageOwner();
//Array of objects from (parking slots class) (array of slots)
        ParkingSlot[] mySlots = null;
        
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        Scanner scanner5 = new Scanner(System.in);
        Scanner scanner6 = new Scanner(System.in);
        Scanner scanner7 = new Scanner(System.in);
        Scanner scanner8 = new Scanner(System.in);
        Scanner scanner9 = new Scanner(System.in);
        Scanner scanner10 = new Scanner(System.in);
        Scanner scanner11 = new Scanner(System.in);
        Scanner scanner12 = new Scanner(System.in);
        Scanner scanner13 = new Scanner(System.in);
        Scanner scanner14 = new Scanner(System.in);
        Scanner scanner15 = new Scanner(System.in);
        Scanner scanner16 = new Scanner(System.in);
        Scanner scanner17 = new Scanner(System.in);
        Scanner scanner18 = new Scanner(System.in);
        Scanner scanner19 = new Scanner(System.in);
        Scanner scanner20 = new Scanner(System.in);
        Scanner scanner21 = new Scanner(System.in);

        
        boolean bool = true;
        while (bool) {
            System.out.println("Press:\n1-If you're Garage Owner\n2-if you're vehicle owner");
            int choice = scanner1.nextInt();
            switch (choice) {
                /////////////////////////////////Garage owner////////////////////////////////////
                case 1:
                    System.out.println("select: login or register");
                    String input1 = scanner13.nextLine();

                    if (input1.equals("register")) {
                        System.out.println("Admin username");
                        String AdminUser = scanner2.nextLine();
                        System.out.println("Password");
                        String Adminpassword = scanner3.nextLine();
                        System.out.println("Email:");
                        String email = scanner14.nextLine();
                        G1.signup(AdminUser, Adminpassword, email);

                        System.out.println("Enter number of slots:");
                        int numSlots = scanner4.nextInt();

                        //Array of objects from (parking slots class) (array of slots)
                        mySlots = new ParkingSlot[numSlots];
                        for (int i = 0; i < numSlots; i++) {
                            System.out.println("Enter slot ID, length, width(Separated by ENTER key):");
                            int slotID = scanner10.nextInt();
                            double length = scanner11.nextInt();
                            double width = scanner12.nextInt();
                            mySlots[i] = new ParkingSlot(length, width, slotID);

                        }

                    }//End if register Garage owner
                    else if (input1.equals("login")) {
                        System.out.println("Admin username");
                        String AdminUser = scanner2.nextLine();
                        System.out.println("Password");
                        String Adminpassword = scanner3.nextLine();
                        G1.login(AdminUser, Adminpassword);

                        ///////////////Display Available Slots or total income or total vehicles/////////////////
                        System.out.println("Choose:\n1-display available slots in the garage\n2-Display total number of vehicles that have used the garage\n3-Display total income of the garage");
                       int choice2 = scanner15.nextInt();
                       switch(choice2){
                           case 1:
                             G1.displayAvailableSlots(mySlots);
                             break;
                             
                           case 2:
                             G1.printTotalVehicles();
                             break;
                           
                           case 3:
                               G1.printTotalIncome();
                               break;
                       }
                    }

                    break;
                             
                ////////////////////////////// Vehicle owner //////////////////////////////////////
                case 2:
                    System.out.println("select: login or register");
                    String input2 = scanner2.nextLine();

                    if (input2.equals("login")) {
                        System.out.println("username");
                        String vehicleuser = scanner3.nextLine();
                        System.out.println("Password");
                        String password = scanner9.nextLine();
                        v1.login(vehicleuser, password);
                        
                        
                        //After login, ask user if he want to park in or park out
                        System.out.println("Do you want to:\n1-Park-in your vehicle.\n2-Park-out your vehicle");
                        int choice2 = scanner18.nextInt();
                        switch(choice2){
                            case 1:       
                                    System.out.println("Enter ID, length, width of your vehicle(Separated by ENTER key):");
                                    int IDToParkIn=scanner16.nextInt();
                                    v1.Vlength = scanner5.nextDouble();
                                    v1.Vwidth = scanner6.nextDouble();
                                    v1.parkIn(IDToParkIn,mySlots);
                                    break;
                            case 2:
                                     System.out.println("Enter your vehicle ID:");
                                     int IDToParkOut=scanner19.nextInt();
                                     v1.parkOut(IDToParkOut, mySlots);
                              break;
                        }
                        
                        
                        
                        


                    } else if (input2.equals("register")) {
                        System.out.println("username");
                        String username = scanner5.nextLine();
                        System.out.println("Password");
                        String password = scanner6.nextLine();
                        System.out.println("email");
                        String email = scanner7.nextLine();
                        v1.signup(username, password, email);

                        System.out.println("Enter ID,length, width, model name and model year of your vehicle(Separated by ENTER key):");
                        int IDToParkIn2=scanner17.nextInt();
                        v1.Vlength = scanner5.nextDouble();
                        v1.Vwidth = scanner6.nextDouble();
                        v1.VmodelName = scanner7.nextLine();
                        v1.VmodelYear = scanner8.nextInt();
                        v1.parkIn(IDToParkIn2,mySlots);
                    } else {
                        System.out.println("invild option, chose login or regiser!");
                    }

            }
        }//end while
        scanner1.close();
        scanner2.close();
        scanner3.close();
        scanner4.close();
        scanner5.close();
        scanner6.close();
        scanner7.close();
        scanner8.close();
        scanner9.close();
        scanner10.close();
        scanner11.close();
        scanner12.close();
    }
}
