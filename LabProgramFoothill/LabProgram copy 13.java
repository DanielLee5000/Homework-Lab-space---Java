/*Daniel Lee, CS1A, 2/8/2025, Dr.Harden, 4.16 LAB: Count characters
 * Initial file comment:
 * The user should input one character and a string to search, separate with space.
 * 
 * This program will first read the character then read the string that need to be search.
 * After that a loop will start to compare the char with string to count how many times the character appear.
 * The loop will do same times as the length of the string.
 * Output the times, character and add 's if need.
 */

 import java.util.Scanner;

 public class LabProgram{
     public static void main(String[] args) {
         try (Scanner scnr = new Scanner(System.in)) {
            
            String matchCharacter;
            String stringLine;
            int appearTimes = 0;

            String outputHolder = "";

            matchCharacter = scnr.next();
            stringLine = scnr.nextLine();
            
            for (int i = 0; i < stringLine.length(); i++) {
                if(matchCharacter.charAt(0) == stringLine.charAt(i)){
                    appearTimes++;
                }
            }
            outputHolder += appearTimes + " " + matchCharacter;
            if(appearTimes != 1)
                outputHolder += "'s";

            System.out.print(outputHolder);
        }
     }
 }
