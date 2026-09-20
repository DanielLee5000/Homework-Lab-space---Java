/*Daniel Lee, CS1A, 1/27/2025, Dr.Harden, 3.24 LAB: Exact change
 * Initial file comment:
 * The user should input an integer.
 * 
 * The output will be the change using the fewest coins, one coin type per line.
 * 
 * I first seprate the result from go into the if-else statement or "No change" result
 * Then, if the input go into the statement. the outputHolder will start to hold the text it needs.
 * For example, in the Quarter part. The input(changeAmountInPennies) will divided by the valueOf_Quarter.
 * And with a small judge of singular or plural to add the right text message. 
 * After that, I reduce the amount already distribute to Quarter.
 * Then we move on to Dime and go the similar.
 */

import java.util.Scanner;

public class LabProgram{
    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {

            final int valueOf_Pennies = 1;
            final int valueOf_Nickel = 5;
            final int valueOf_Dime = 10;
            final int valueOf_Quarter = 25;
            final int valueOf_Dollar = 100;

            int changeAmountInPennies;
            String outputHolder = "";

            changeAmountInPennies = scnr.nextInt();

            if(changeAmountInPennies > 0){
                if(changeAmountInPennies / valueOf_Dollar > 0){
                outputHolder += changeAmountInPennies / valueOf_Dollar + " Dollar";

                outputHolder = (changeAmountInPennies / valueOf_Dollar == 1) ? outputHolder : outputHolder + "s";
                outputHolder += "\n";

                changeAmountInPennies %= valueOf_Dollar;
                }

                if (changeAmountInPennies / valueOf_Quarter > 0) {
                outputHolder += changeAmountInPennies / valueOf_Quarter + " Quarter";

                outputHolder = (changeAmountInPennies / valueOf_Quarter == 1) ? outputHolder : outputHolder + "s";
                outputHolder += "\n";

                changeAmountInPennies %= valueOf_Quarter;
                }

                if(changeAmountInPennies / valueOf_Dime > 0){
                    outputHolder += changeAmountInPennies / valueOf_Dime + " Dime";

                    outputHolder = (changeAmountInPennies / valueOf_Dime == 1) ? outputHolder : outputHolder + "s";
                    outputHolder += "\n";

                    changeAmountInPennies %= valueOf_Dime;
                }

                if(changeAmountInPennies / valueOf_Nickel > 0){
                    outputHolder += changeAmountInPennies / valueOf_Nickel + " Nickel";

                    outputHolder = (changeAmountInPennies / valueOf_Nickel == 1) ? outputHolder : outputHolder + "s";
                    outputHolder += "\n";

                    changeAmountInPennies %= valueOf_Nickel;
                }

                if(changeAmountInPennies / valueOf_Pennies > 0){
                    outputHolder += changeAmountInPennies / valueOf_Pennies + " Penn";

                    outputHolder = (changeAmountInPennies / valueOf_Pennies == 1) ? outputHolder + "y" : outputHolder + "ies";
                    outputHolder += "\n";
                }
                
            }else{
                outputHolder = "No change\n";
            }

            System.out.print(outputHolder);
        }
    }
}
