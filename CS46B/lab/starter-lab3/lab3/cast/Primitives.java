package lab3.cast;

/**
 * Primitives
 */
public class Primitives {
    static public void dumpMaxValues(){
        System.out.println("Byte MAX: " + Byte.MAX_VALUE);
        System.out.println("Short MAX: " + Short.MAX_VALUE);
        System.out.println("Integer MAX: " + Integer.MAX_VALUE);
        System.out.println("Long MAX: " + Long.MAX_VALUE);
        System.out.println("Float MAX: " + Float.MAX_VALUE);
        System.out.println("Double MAX: " + Double.MAX_VALUE);
    }
    
    public static void main(String[] args) {
        dumpMaxValues();

        // int = long
        long l1 =
        Long.MAX_VALUE; 
        int i1 = (int)l1;
        System.out.println("long to int: " + l1 + ", " + i1);

        // int = long (MAX - 5) 
        long l2 =
        Long.MAX_VALUE; 
        int i2 = (int)l2;
        System.out.println("long to int: " + l2 + ", " + i2);

        // long = int
        int i3 = Integer.MAX_VALUE;
        long l3 = (long)i3;
        System.out.println("int to long: " + i3 + ", " + l3);

        // double = byte
        byte b1 = 100;
        double d1 = (double)b1;
        System.out.println("byte to double: " + b1 + ", " + d1);

        // byte = double
        double d2 = 45.67;
        byte b2 = (byte)d2;
        System.out.println("double to byte: " + d2 + ", " + b2);

        // byte = double
        double d3 = 456.789;
        byte b3 = (byte)d3;
        System.out.println("double to byte (large): " + d3 + ", " + b3);

        // long = float
        float f1 = 12345.6789f;
        long l4 = (long) f1;
        System.out.println("float to long: " + f1 + ", " + l4);

        // long = float
        float f2 = Float.MAX_VALUE;
        long l5 = (long) f2;
        System.out.println("float max to long: " + f2 + ", " + l5);

        // float = long 
        long l6 = Long.MAX_VALUE;
        float f3 = (float)l6;
        System.out.println("long max to float: " + l6 + ", " + f3);
    }
}