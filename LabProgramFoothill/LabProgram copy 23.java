 /*Daniel Lee, CS1A, 3/3/2025, Dr.Harden, 6.29 LAB: Word frequencies - methods
 * Initial file comment:
 * The user should input a integers as the numbers amount and follow by a list of words.
 * 
 * The program will read the first number to create an Array to save the follow words.
 * After that, the program will traverse each words in the list and use the getWordFrequency method to compare with them to sace the Frequencies in another Array.
 * This will do on each words in the list.
 * Once it done, the last loop will come out and create the output.
 */

 import java.util.Scanner;

 public class LabProgram{
     public static int getWordFrequency(String[] wordsList, int listSize, String currWord){
        int result = 0;    
        
        for(String traverse : wordsList){
            if(currWord.equalsIgnoreCase(traverse))
                result += 1;
        }
        return result;
     }

     public static void main(String[] args) {
         try (Scanner scnr = new Scanner(System.in)) {    
            
            String outputHolder = "";        

            int ListAmount = scnr.nextInt();
            String[] words = new String[ListAmount];

            for(int i = 0; i < ListAmount; i++){
                words[i] = scnr.next();
            }

            for(String traverse : words){
                    outputHolder += traverse + " " + getWordFrequency(words,ListAmount,traverse) + "\n";
            }
            System.out.print(outputHolder);
        }
     }
 }