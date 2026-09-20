/*Daniel Lee, CS1A, 1/27/2025, Dr.Harden, 3.26 LAB: Name format
 * Initial file comment:
 * The user should input lastName, firstInitial and middleInitial, separate with space.
 * 
 * The output will print the user's name in a new format.
 * 
 * I use spilt and one-dimensional array to seprate the name of the users.
 * And print them out in the right format.
 */

import java.util.Scanner;

public class LabProgram{
    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {

            String firstName;
            String middleName;
            String lastName;

            String nameInput;
            String[] nameParts;

            String outputHolder = "";

            nameInput = scnr.nextLine();
            nameParts = nameInput.split(" ");

            if (nameParts.length == 2) {
                firstName = nameParts[0];
                lastName = nameParts[1];

                outputHolder += (lastName + ", " + firstName.charAt(0) + ".");
            } else if (nameParts.length == 3) {
                firstName = nameParts[0];
                middleName = nameParts[1];
                lastName = nameParts[2];

                outputHolder += (lastName + ", " + firstName.charAt(0) + "." + middleName.charAt(0) + ".");
            }
        System.out.println(outputHolder);
    }
}
}
