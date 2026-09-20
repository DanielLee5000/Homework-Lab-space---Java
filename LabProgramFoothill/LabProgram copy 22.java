 /*Daniel Lee, CS1A, 2/18/2025, Dr.Harden, 5.18 LAB: Contains the character
 * Initial file comment:
 * The user should input a integers as the numbers amount and follow by a list of words. End with a thresholdCharacter. 
 * 
 * The program will first save the string Array that has listAmount of words.
 * After that, the second loop will traverse the words Array. Use contains method to check each word.
 * If the word do have the thresholdCharacter inside, it will be add into the outputholder and been output once the program finish.
 */

 import java.util.Scanner;

 public class LabProgram{
     public static void main(String[] args) {
         try (Scanner scnr = new Scanner(System.in)) {    
            String outputHolder = "";        

            int ListAmount = scnr.nextInt();
            String[] words = new String[ListAmount];

            for(int i = 0; i < ListAmount; i++){
                words[i] = scnr.next();
            }

            String thresholdCharacter = scnr.next();
            for(String traverse : words){
                if(traverse.contains(thresholdCharacter))
                    outputHolder += traverse + ",";
            }

            System.out.println(outputHolder);
        }
     }
 }