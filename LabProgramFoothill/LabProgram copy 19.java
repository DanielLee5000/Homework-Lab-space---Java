 /*Daniel Lee, CS1A, 2/18/2025, Dr.Harden, 5.15 LAB: Output values below an amount
 * Initial file comment:
 * The user should input a sort list of integers, start with the numbers amount end with a thresholdNumber.
 * 
 * The program will read the first number to create an Array to save the following numbers.
 * After the following numbers been saved, the last number will be read as a thresholdNumber.
 * By using it the judge each number in the numbers list. The program then will output the numbers that less or equal to the thresholdNumber.
 */

 import java.util.Scanner;

 public class LabProgram{
     public static void main(String[] args) {
         try (Scanner scnr = new Scanner(System.in)) {            
            String outputHolder = "";

            int MaxListAmount = scnr.nextInt();
            int[] numbers = new int[MaxListAmount];

            for(int i = 0; i < MaxListAmount; i++){
                numbers[i] = scnr.nextInt();
            }

            int thresholdNumber = scnr.nextInt();
            for(int traverse : numbers){
                if(traverse <= thresholdNumber)
                    outputHolder += traverse + ",";
            }

            System.out.println(outputHolder);
        }
     }
 }