/*Daniel Lee, CS1A, 1/27/2025, Dr.Harden, 3.27 LAB: Login name
 * Initial file comment:
 * The user should input firstInitial, lastName and a four-digit integer, separate with space.
 * 
 * The output will print the user's login name.
 * 
 * I first get the input separately.
 * And judge the firstName of the user whether more than six letter or not.
 * After that, the output follow with the request.
 */

import java.util.Scanner;

public class LabProgram{
    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {
            final String startingSentence = "Your login name: ";

            String firstName;
            String lastName;
            int fourDigitInteger;

            String outputHolder = "";

            firstName = scnr.next();
            lastName = scnr.next();
            fourDigitInteger = scnr.nextInt();

            outputHolder += startingSentence;

            if (firstName.length() < 6) {
                outputHolder += firstName;
            }else{
                outputHolder += firstName.substring(0, 6);
            }

            outputHolder += lastName.charAt(0);
            outputHolder += "_" + fourDigitInteger % 10;

        System.out.println(outputHolder);
    }
}
}
