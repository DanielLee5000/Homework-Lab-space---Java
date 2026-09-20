 /*Daniel Lee, CS1A, 3/3/2025, Dr.Harden, 6.30 LAB: Fibonacci sequence
 * Initial file comment:
 * The user should input a integers as the index of the Fibonacci Sequence.
 * 
 * The main function will call fibonacci to get the number.
 * By recall itself severl times, the output will be return.
 * At the end, print out with the string. 
 */

 import java.util.Scanner;

 public class LabProgram{
     public static int fibonacci(int number){
        if(number < 0)
            return -1;   
        
        switch(number){
            case 0:
                return 0;
                //break;
            case 1:
                return 1;
                //break;
            default:
                return fibonacci(number - 1) + fibonacci(number - 2);
        }
        
     }

     public static void main(String[] args) {
         try (Scanner scnr = new Scanner(System.in)) {    
            
            String outputHolder = "";        
            int indexOfFibonacci = scnr.nextInt();
            
            outputHolder += "fibonacci(" + indexOfFibonacci + ") is " + fibonacci(indexOfFibonacci);
            System.out.println(outputHolder);
        }
     }
 }