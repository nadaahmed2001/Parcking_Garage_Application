/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
