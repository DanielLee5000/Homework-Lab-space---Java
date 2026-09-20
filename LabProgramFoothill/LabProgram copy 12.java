/*Daniel Lee, CS1A, 2/8/2025, Dr.Harden, 4.15 LAB: Varied amount of input data
 * Initial file comment:
 * The user should input numbers, separate with space or input untill there is a negetive integer.
 * 
 * The program will first initialize the variables.
 * And start to read input one by one, untill there is a negetive integer.
 * Then, the loop will break out. Output with Max and average number.
 */

 import java.util.Scanner;

 public class LabProgram{
     public static void main(String[] args) {
         try (Scanner scnr = new Scanner(System.in)) {
            
            int currentInputNumber = 0;
            int inputCounter = 0;
            int totalAmount = 0;
            int maxNumber = 0;

            double average = 0;

            while (currentInputNumber >= 0){
                currentInputNumber = scnr.nextInt();

                if(currentInputNumber < 0)
                    break;
                
                totalAmount += currentInputNumber;
                inputCounter++;

                if(maxNumber < currentInputNumber)
                    maxNumber = currentInputNumber;
            }
            System.out.print(maxNumber + " ");

            average = (double)totalAmount / inputCounter;
            System.out.printf("%.2f\n", average);
        }
     }
 }
 
