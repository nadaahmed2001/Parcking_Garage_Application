package phase1;

public abstract class GarageUser{

    String FirstName;
    String LastName;
    String username;
    String Password;
    String email;
    
   //object from class total to save, print total income and total vehicles
    Total total;
  

    public abstract void login(String e, String p);
    public abstract  void signup(String user,String pass,String e);
}
