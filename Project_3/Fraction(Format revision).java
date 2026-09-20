 /*Daniel Lee, CS1A, 3/17/2025, Dr.Harden, 7.29 Project 3
 * Initial file comment:
 * Fraction class will help user to display and caculate Fraction.
 * 
 * It has two constructors and two private variables which name numerator and denominator.
 * It allow user to add, subtract, multiplied, divided and compare equal two fraction.
 * The fraction will be automatically simplify when useing functions.
 * At the end output stage, user can use print function to print out the fraction to display them.
 */

public class Fraction {
    private int numerator; //numerator
    private int denominator; //denominator

    //default constructors
    public Fraction(){ 
        numerator = 0;
        denominator = 1;
    }





    
    //normal constructors
    public Fraction(int numerator, int denominator) { 
        this.numerator = numerator;
        this.denominator = denominator;
    }






    
    //Numerator setter
    public void setNumerator(int numerator){ 
        this.numerator = numerator;
    }







    //Domenator setter
    public void setDomenator(int denominator){ //Domenator setter
        this.denominator = denominator;
    }






    //Numerator getter
    public int getNumerator(){ 
        return numerator;
    }







    //Domenator getter
    public int getDomenator(){
        return denominator;
    }






    //To simplify fraction
    private void simplify(){
        int smallerNum = 0;

        smallerNum = (numerator > denominator) ? numerator : denominator;

        for (int i = smallerNum; i >= 1; i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                numerator /= i;
                denominator /= i;
                break; 
            }
        }
    }







    // add two fractions together, simplify then return result
    public Fraction addedTo(Fraction userFraction){
        Fraction newFraction = new Fraction();
        int userDomenator = userFraction.getDomenator();
        int userNumerator = userFraction.getNumerator();
        
        newFraction.setDomenator(denominator * userDomenator);
        newFraction.setNumerator(numerator * userDomenator + userNumerator * denominator);

        newFraction.simplify();
        return newFraction;
    }







    // subtract two fractions, simplify then return result
    public Fraction subtract(Fraction userFraction){
        Fraction newFraction = new Fraction();
        int userDomenator = userFraction.getDomenator();
        int userNumerator = userFraction.getNumerator();

        newFraction.setDomenator(denominator * userDomenator);
        newFraction.setNumerator(numerator * userFraction.getDomenator() - userNumerator * denominator);

        newFraction.simplify();
        return newFraction;
    }







    // mulitiplied two fractions, simplify then return result
    public Fraction multipliedBy(Fraction userFraction){
        Fraction newFraction = new Fraction();

        newFraction.setDomenator(denominator * userFraction.getDomenator());
        newFraction.setNumerator(numerator * userFraction.getNumerator());

        newFraction.simplify();
        return newFraction;
    }







    // divided two fractions, simplify then return result
    public Fraction dividedBy(Fraction userFraction){
        Fraction newFraction = new Fraction();

        newFraction.setDomenator(denominator * userFraction.getNumerator());
        newFraction.setNumerator(numerator * userFraction.getDomenator());

        newFraction.simplify();
        return newFraction;
    }








    // compare two fractions to judge if they are equal, simplify then return result
    public boolean isEqualTo(Fraction userFraction){
        int userDomenator = userFraction.getDomenator();
        int userNumerator = userFraction.getNumerator();
        
        userFraction.simplify();
        return (numerator == userNumerator && denominator == userDomenator);
    }







    // simplify (just in case) and print out fraction
    public void print(){
        simplify();
        System.out.print(numerator + "/" + denominator);
    }
}