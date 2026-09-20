 /*Daniel Lee, CS1A, 3/17/2025, Dr.Harden, 7.29 Project 3
 * Initial file comment:
 * Fraction class will help user to display and caculate Fraction.
 * 
 * It has two constructors and two private variables which name numerator and denominator.
 * It allow user to add, subtract, multiplied, divided and compare equal two fraction.
 * The fraction will be automatically simplify when useing functions.
 * At the end output stage, user can use print function to print out the fraction to display them.
 */

package Project_3;
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(){
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setnumerator(int numerator){
        this.numerator = numerator;
    }

    public void setDomenator(int denominator){
        this.denominator = denominator;
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDomenator(){
        return denominator;
    }

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

    public Fraction addedTo(Fraction userFraction){
        Fraction newFraction = new Fraction();
        newFraction.setDomenator(denominator * userFraction.getDomenator());
        newFraction.setnumerator(numerator * userFraction.getDomenator() + userFraction.getNumerator() * denominator);

        newFraction.simplify();
        return newFraction;
    }

    public Fraction subtract(Fraction userFraction){
        Fraction newFraction = new Fraction();
        newFraction.setDomenator(denominator * userFraction.getDomenator());
        newFraction.setnumerator(numerator * userFraction.getDomenator() - userFraction.getNumerator() * denominator);

        newFraction.simplify();
        return newFraction;
    }

    public Fraction multipliedBy(Fraction userFraction){
        Fraction newFraction = new Fraction();
        newFraction.setDomenator(denominator * userFraction.getDomenator());
        newFraction.setnumerator(numerator * userFraction.getNumerator());

        newFraction.simplify();
        return newFraction;
    }

    public Fraction dividedBy(Fraction userFraction){
        Fraction newFraction = new Fraction();
        newFraction.setDomenator(denominator * userFraction.getNumerator());
        newFraction.setnumerator(numerator * userFraction.getDomenator());

        newFraction.simplify();
        return newFraction;
    }

    public boolean isEqualTo(Fraction userFraction){
        userFraction.simplify();

        return (numerator == userFraction.getNumerator() && denominator == userFraction.getDomenator());
    }

    public void print(){
        simplify();
        System.out.print(numerator + "/" + denominator);
    }
}