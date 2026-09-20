/*Daniel Lee, CS1A, 1/27/2025, Dr.Harden, 3.25 LAB: Leap year
 * Initial file comment:
 * The user should input an thousand digit integer.
 * 
 * The output will print the number user input, with whether this year is a leap year.
 * 
 * I first seprate the input that can be divisible by 4 with nothing left.
 * And then for the special case for centry year, I make the outputHolder get cover if it happen.
 */

import java.util.Scanner;

public class LabProgram{
    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {

            final int centuryYear = 100;
            final String leapYear = " - leap year";
            final String notLeapYear = " - not a leap year";

            int yearInput;
            String outputHolder = "";

            yearInput = scnr.nextInt();

            if (yearInput % 4 == 0){
                outputHolder += yearInput + leapYear;

                if(yearInput % centuryYear == 0 && yearInput % 400 != 0)
                    outputHolder = yearInput + notLeapYear;

            }else{
                outputHolder += yearInput + notLeapYear;
            }

            System.out.println(outputHolder);
        }
    }
}
