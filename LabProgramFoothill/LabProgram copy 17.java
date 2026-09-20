 /*Daniel Lee, CS1A, 2/18/2025, Dr.Harden, 5.13 LAB: Output numbers in reverse
 * Initial file comment:
 * The user should input an integer indicating the number of integers that follow.
 * 
 * The program will first save the total integer amount.
 * Then read the following numbers save in the Array with the same name.
 * After that, the numbers will be save in a reverse type to the Array call reverseNumber.
 * Once it done, the third loop will do the output.
 */

 import java.util.Scanner;

 public class LabProgram{
     public static void main(String[] args) {
         try (Scanner scnr = new Scanner(System.in)) {
            
            String outputHolder = "";

            int numAmount = scnr.nextInt();
            int[] numbers = new int[numAmount];
            int[] reverseNumber = new int[numAmount];

            for(int i = 0; i < numAmount; i++)
                numbers[i] = scnr.nextInt();

            for(int i = 0; i < numAmount; i++)
                reverseNumber[i] = numbers[numAmount - i - 1];

            for(int i : reverseNumber){
                outputHolder += i + ",";
            }
            System.out.println(outputHolder);
        }
     }
 }