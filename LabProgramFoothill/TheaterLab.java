/*Daniel Lee, CS1A, 2/3/2025, Dr.Harden, Project1
 * Initial file comment:
 * The user should input each person's age and their food prefer follow on the new line.
 * And user can stop input by putting negetive number in age.
 * 
 * The program will first require the age for first person. 
 * If they use a negetive number at first case, the program will output a error message with no further output. 
 * If above situation is not true, the loop will start until user input a negetive number.
 * 
 * In side the loop, once the program get input. The input will first been distribute into its age period. (If age been found out is negetive, jump out from loop)
 * After that, second input information about foodPrefer will ask for new input. And distribute it to numOf-food for further result.
 * Once two inputs are checked and done, the numberOfInput will increase by one. And the sumAge will been store here.
 * And at the end of the loop, youngestAge and oldestAge will been checked here and store for output (they will be initialize on the first case).
 * 
 * Any further output messege is outside the loop.
 */

import java.util.Scanner;

public class TheaterLab {                         
   public static void main (String [ ] args) { 
    
    final int zero = 0;
    final int eighteen = 18;
    final int nineteen = 19;
    final int thirty = 30;
    final int thirtyOne = 31;
    final int fourty = 40;
    final int fourtyOne = 41;
    final int sixty = 60;  
         
    Scanner scnr= new Scanner(System.in);
    int age_0to18 = 0;
    int age_19to30 = 0;
    int age_31to40 = 0;
    int age_41to60 = 0;
    int over_60 = 0;

    int sumAge = 0;
    int numberOfInput = 0;
    int youngestAge = 0;
    int oldestAge = 0;

    int inputAge = 1;

    String foodPrefer;
    int numOfPopcorn = 0;
    int numOfSoda = 0;
    int numOfBoth = 0;


    while (inputAge >= 0){

        System.out.print("Enter age of attendee (negative number to quit): ");
        inputAge = scnr.nextInt();
        
        if(inputAge >= zero && inputAge <= eighteen){
            age_0to18++;
        }else if(inputAge >= nineteen && inputAge <= thirty){
            age_19to30++;
        }else if(inputAge >= thirtyOne && inputAge <= fourty){
            age_31to40++;
        }else if(inputAge >= fourtyOne && inputAge <= sixty){
            age_41to60++;
        }else if(inputAge > sixty){
            over_60++;
        }else{
            break;
        }


        System.out.print("Enter food preference ('p' for popcorn, 's' for soda, 'b' for both): ");
        foodPrefer = scnr.next();

        switch(foodPrefer){
            case "p":
                numOfPopcorn++;
                break;
            case "s":
                numOfSoda++;
                break;
            case "b":
                numOfBoth++;
                break;
        }


        numberOfInput++;
        sumAge += inputAge;

        if(numberOfInput == 1){
            youngestAge = inputAge;
        }else if(youngestAge > inputAge){
            youngestAge = inputAge;
        }

        if(numberOfInput == 1){
            oldestAge = inputAge;
        }else if(oldestAge < inputAge){
            oldestAge = inputAge;
        }
    }

    System.out.println();

    if(numberOfInput == 0 && inputAge < 0){
        System.out.println("No attendees were entered.");

    }else{
        System.out.println("age 0  to 18: " + age_0to18);
        System.out.println("age 19 to 30: " + age_19to30);
        System.out.println("age 31 to 40: " + age_31to40);
        System.out.println("age 41 to 60: " + age_41to60);
        System.out.println("age over 60:  " + over_60);
        System.out.println();

        System.out.println("food preference popcorn: " + numOfPopcorn);
        System.out.println("food preference soda: " + numOfSoda);
        System.out.println("food preference both: " + numOfBoth);

        System.out.print("The average age was ");
        System.out.printf("%.1f", (double)sumAge / numberOfInput);
        System.out.println(".");

        System.out.println("The youngest person in attendance was " + youngestAge + ".");
        System.out.println("The oldest person in attendance was " + oldestAge + ".");
    }
    
    scnr.close();
    }
}
