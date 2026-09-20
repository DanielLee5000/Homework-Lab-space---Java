/*Daniel Lee, CS1A, 3/17/2025, Dr.Harden, 7.28 LAB: Vending machine
 * Initial file comment:
 * The main program will use class VendingMachine to operate a virtual vending machine.
 * 
 * The user should input two intger numbers. First as the amuont bottle been purchased.
 * Second will be the amuont bottle that been restock.
 * At the end, call report function to print out what we have inside the vending machine.
 * 
 */

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      VendingMachine vendingMachine = new VendingMachine();
      
      vendingMachine.purchase(scnr.nextInt());
      vendingMachine.restock(scnr.nextInt());

      vendingMachine.report();
   }
}
