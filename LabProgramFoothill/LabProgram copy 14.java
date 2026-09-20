 /*Daniel Lee, CS1A, 2/8/2025, Dr.Harden, 4.17 LAB: Remove all non alpha characters
 * Initial file comment:
 * The user should input a string to start.
 * 
 * The program will read the input one by one in a loop. 
 * If it is a letter, save it to newString for later output.
 */

 import java.util.Scanner;

 public class LabProgram{
     public static void main(String[] args) {
         try (Scanner scnr = new Scanner(System.in)) {
            
            String inputString;
            String newString = "";
            String outputHolder = "";

            inputString = scnr.nextLine();
            
            for (int i = 0; i < inputString.length(); i++) {
                if(Character.isLetter(inputString.charAt(i))){
                    newString += inputString.charAt(i);
                }
            }

            outputHolder = newString;
            System.out.println(outputHolder);
        }
     }
 }
 
