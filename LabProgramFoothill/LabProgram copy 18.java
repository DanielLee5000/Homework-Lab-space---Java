 /*Daniel Lee, CS1A, 2/18/2025, Dr.Harden, 5.14 LAB: Middle item
 * Initial file comment:
 * The user should input a sorted list of integers. End with a negative number.
 * 
 * The programe will read the input numbers which should less then 10, and the counter will count the total numbers user input.
 * (not include the negetive number at the end).
 * Here, if the numbers are more than MaxListAmount, the program will output "Too many numbers".
 * Else, the program will output the middle item.
 */

 import java.util.Scanner;

 public class LabProgram{
     public static void main(String[] args) {
         try (Scanner scnr = new Scanner(System.in)) {
            final int MaxListAmount = 9;
            
            String outputHolder = "";

            int counter = 0;
            int[] numbers = new int[MaxListAmount + 1];
            boolean amountJudge_over = false;
            

            while(true){                     
                int input = scnr.nextInt();
                if(input < 0){
                    break;
                }
                if(counter > MaxListAmount){
                    amountJudge_over = true;
                    break;
                }

                numbers[counter] = input;
                counter++;
            }

            outputHolder = (amountJudge_over)? "Too many numbers" : "Middle item: " + numbers[counter / 2];

            System.out.println(outputHolder);
        }
     }
 }