 /*Daniel Lee, CS1A, 2/8/2025, Dr.Harden, 4.18 LAB: Output range with increment of 5
 * Initial file comment:
 * The user should input two number, seprate by space.
 * The firstNum should be less or equal to secondNum or the program will output with a error message.
 * 
 * The program will read two number. And compare them to decide whether it should go into the loop.
 * Inside the loop, the outputHolder will save currentNum (initialize as firstNum) inside.
 * And if the currentNum still smaller than SecondNum, plus 5 and do the loop again. 
 * After that, print out the outputHolder.
 */

 import java.util.Scanner;

 public class LabProgram{
     public static void main(String[] args) {
         try (Scanner scnr = new Scanner(System.in)) {
            
            int firstNum;
            int SecondNum;

            String outputHolder = "";

            firstNum = scnr.nextInt();
            SecondNum = scnr.nextInt();
            
            if (firstNum <= SecondNum) {
                int currentNum = firstNum;

                while (currentNum <= SecondNum){
                    outputHolder += currentNum + " ";
                    currentNum += 5;
                }

            }else{
                outputHolder += "Second integer can't be less than the first.";
            }

            System.out.println(outputHolder);
        }
     }
 }
 
