/*Daniel Lee, CS1A, 1/27/2025, Dr.Harden, 3.26 LAB: Name format
 * Initial file comment:
 * The user should input lastName, firstInitial and middleInitial, separate with space.
 * 
 * The output will print the user's name in a new format.
 * 
 * I use substring, indexOf and lastindexOf to seprate the input which has middle name and those don't have.
 * By check the position of space for the first and the last one. We are able to delimit three part of name (or just two).
 * In different branch.
 */

 import java.util.Scanner;

 public class LabProgram{
     public static void main(String[] args) {
         try (Scanner scnr = new Scanner(System.in)) {
 
             String firstName;
             String middleName = "";
             String lastName;
 
             String nameInput;
             String outputHolder = "";
 
             nameInput = scnr.nextLine();

             firstName = nameInput.substring(0, nameInput.indexOf(" "));

             if(nameInput.indexOf(" ") == nameInput.lastIndexOf(" ")){
                lastName = nameInput.substring(nameInput.indexOf(" ") + 1);

                outputHolder += lastName + ", " + firstName.charAt(0) + ".";
             }else{
                middleName = nameInput.substring(nameInput.indexOf(" ") + 1, nameInput.lastIndexOf(" "));
                lastName =  nameInput.substring(nameInput.lastIndexOf(" ") + 1);

                outputHolder += lastName + ", " + firstName.charAt(0) + "." + middleName.charAt(0) + ".";
             }
 
             System.out.println(outputHolder);
             }
     }
 }
 
