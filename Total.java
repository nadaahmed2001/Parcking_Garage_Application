package phase1;

/**
 *
 * @author Nada
 */
public class Total {

   static double totalIncome=0;
   static int totalVehicles = 0;

    public static void countVehicles() {
         totalVehicles++;
    }

    public int printVehicles() {
       return totalVehicles;

    }

    public static void CountIncome(double income) {
        totalIncome += income;
    }
    
        public double printIncome() {
            return totalIncome;
        }
}
