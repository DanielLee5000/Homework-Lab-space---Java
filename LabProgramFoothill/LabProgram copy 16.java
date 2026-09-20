 /*Daniel Lee, CS1A, 2/8/2025, Dr.Harden, 4.19 LAB: Print string in reverse
 * Initial file comment:
 * The user can keep input untill input Done, done or d.
 * 
 * The program will save the input one by one in a reverse way.
 * Loop will end once the user input the EndTrigger words.
 */

 import java.util.Scanner;

 public class LabProgram{
     public static void main(String[] args) {
         try (Scanner scnr = new Scanner(System.in)) {
            final String EndTrigger_Done = "Done";
            final String EndTrigger_done = "done";
            final String EndTrigger_d = "d";
            
            String inputString = "";
            String outputString = "";

            String outputHolder = "";

            inputString = scnr.nextLine();

            while(!inputString.equals(EndTrigger_Done) && !inputString.equals(EndTrigger_done) && !inputString.equals(EndTrigger_d)){
                for(int i = inputString.length() - 1; i >= 0; i--){
                    outputString += inputString.charAt(i);
                }

                outputHolder += outputString + "\n";
                outputString = "";

                inputString = scnr.nextLine();
            }

            System.out.print(outputHolder);
        }
     }
 }
 
