/*Daniel Lee, CS1A, 1/24/2025, Dr.Harden, Lab2.9:Convert to dollars
 * Initial file comment:
 * The user should input three number, separate with space.
 * The numbers mean the amount of each kind of coins,
 * List as Nickel, Dime and Quarter.
 * 
 * The output will be total value of all the coins.
 */

import java.util.Scanner;

public class LabProgram{
    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {
            
            final double valueOf_Nickel = 0.05;
            final double valueOf_Dime = 0.10;
            final double valueOf_Quarter = 0.25;

            int numOf_Nickels;
            int numOf_Dimes;
            int numOf_Quarters;
            double dollars;

            numOf_Nickels = scnr.nextInt();
            numOf_Dimes = scnr.nextInt();
            numOf_Quarters = scnr.nextInt();

            dollars = numOf_Nickels * valueOf_Nickel + numOf_Dimes * valueOf_Dime + numOf_Quarters * valueOf_Quarter;

            System.out.printf("Amount: $%.2f\n", dollars);
        }
    }
}
