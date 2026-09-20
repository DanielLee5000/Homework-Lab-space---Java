 /*Daniel Lee, CS1A, 2/18/2025, Dr.Harden, 5.17 LAB: Word frequencies
 * Initial file comment:
 * The user should input a integers as the numbers amount and follow by a list of words.
 * 
 * The program will read the first number to create an Array to save the follow words.
 * After that, the program will traverse each words in the list and compare with them to sace the Frequencies in another Array.
 * This will do on each words in the list.
 * Once it done, the last loop will come out and create the output.
 */

 import java.util.Scanner;

 public class LabProgram{
     public static void main(String[] args) {
         try (Scanner scnr = new Scanner(System.in)) {    
            String outputHolder = "";        

            int ListAmount = scnr.nextInt();
            String[] Words = new String[ListAmount];
            int[] Frequencies = new int[ListAmount];

            for(int i = 0; i < ListAmount; i++){
                Words[i] = scnr.next();
            }

            for(int i = 0; i < ListAmount; i++){
                for(String traverse : Words){
                    if(Words[i].equals(traverse))
                        Frequencies[i] += 1;
                }
            }

            for(int i = 0; i < ListAmount; i++){
                    outputHolder += Words[i] + " - " + Frequencies[i] + "\n";
            }
            System.out.print(outputHolder);
        }
     }
 }