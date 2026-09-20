/*Daniel Lee, CS1A, 1/27/2025, Dr.Harden, 3.23 LAB: Interstate highway numbers
 * Initial file comment:
 * The user should input a hundreds digit integer.
 * 
 * The output will be the effectiveness of this number as a primary highway or a auxiliary highway number.
 * If it is a primary highway, the output will follow with the direction for the valid highway.
 * If it is a auxiliary highway, the output will follow with the primary highway it searving.
 * And then direction for the valid highway.
 * 
 * I first seprate input into two branch, primary and auxiliary highway. 
 * In the primary one, I add on the String message and check its direction and add more String message to the output holder.
 * In the auxiliary one, I add on the String message with its serving primary highway. And add direction with more String message to the output holder.
 * If the input is not belongs in any group above, the output holder will print the unValid message. 
 */

import java.util.Scanner;

public class LabProgram{
    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {

            final String primaryHighway = " is primary,";
            final String auxiliaryHighway = " is auxiliary,";
            final String goEastWest = " going east/west.";
            final String goNorthSouth = " going north/south.";
            final String unValid = " is not a valid interstate highway number.";

            int highwayNumber;
            String outputHolder = "";

            highwayNumber = scnr.nextInt();
            
            if (highwayNumber / 100 == 0 && highwayNumber > 0){
                outputHolder += "I-" + highwayNumber + primaryHighway;

                if (highwayNumber % 2 == 0) {
                    outputHolder += goEastWest;
                }else{
                    outputHolder += goNorthSouth;
                }
                
            }else if (highwayNumber / 1000  == 0 && (highwayNumber % 100 != 0)){
                outputHolder += "I-" + highwayNumber + auxiliaryHighway;
                outputHolder += " serving I-" + highwayNumber % 100 + ",";

                if (highwayNumber % 2 == 0) {
                    outputHolder += goEastWest;
                }else{
                    outputHolder += goNorthSouth;
                }
            }else{
                outputHolder += highwayNumber + unValid;
            }

            System.out.println(outputHolder);
        }
    }
}
