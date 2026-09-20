package Project_3;
public class VirtualCalculator{
    public static void main(String[] args) {
        Fraction f1 = new Fraction(9,8);
        Fraction f2 = new Fraction(2,3);
        Fraction result = new Fraction();

        System.out.print("The result starts off at ");
        result.print();
        System.out.println();

        System.out.print("The product of ");
        f1.print();
        System.out.print(" and ");
        f2.print();
        System.out.print(" is ");
        result = f1.multipliedBy(f2);
        result.print();
        System.out.println();

        System.out.print("The quotient of ");
        f1.print();
        System.out.print(" and ");
        f2.print();
        System.out.print(" is ");
        result = f1.dividedBy(f2);
        result.print();
        System.out.println();

        System.out.print("The sum of ");
        f1.print();
        System.out.print(" and ");
        f2.print();
        System.out.print(" is ");
        result = f1.addedTo(f2);
        result.print();
        System.out.println();

        System.out.print("The difference of ");
        f1.print();
        System.out.print(" and ");
        f2.print();
        System.out.print(" is ");
        result = f1.subtract(f2);
        result.print();
        System.out.println();

        if (f1.isEqualTo(f2)){
            System.out.println("The two Fractions are equal.");
        } else {
            System.out.println("The two Fractions are not equal.");
        }
        
        Fraction f3 = new Fraction(12, 8);
        Fraction f4 = new Fraction(202, 303);
        result = f3.multipliedBy(f4);
        System.out.print("The product of ");
        f3.print();
        System.out.print(" and ");
        f4.print();
        System.out.print(" is ");
        result.print();
        System.out.println();
    }
}