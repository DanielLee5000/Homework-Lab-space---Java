 /*Daniel Lee, CS1A, 2/18/2025, Dr.Harden, 5.16 LAB: Adjust list by normalizing
 * Initial file comment:
 * The user should input a integers as the numbers amount and follow by floating-point values.
 * 
 * The program will read the first number to create an Array to save the following numbers.
 * During the following numbers been saved, the largest number will be judging and save for later use.
 * After that, the program will output the numbers which been normalizing.
 */

 import java.util.Scanner;

 public class LabProgram{
     public static void main(String[] args) {
         try (Scanner scnr = new Scanner(System.in)) {            

            int ListAmount = scnr.nextInt();
            double[] numbers = new double[ListAmount];
            double largestValue = 0;

            for(int i = 0; i < ListAmount; i++){
                numbers[i] = scnr.nextDouble();

                if(largestValue < numbers[i])
                    largestValue = numbers[i];
            }

            for(double traverse : numbers){
                    System.out.printf("%.2f", traverse / largestValue);
                    System.out.print(" ");
            }
            System.out.println();
        }
     }
 }