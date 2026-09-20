import java.util.Scanner;

public class LabProgram{
    public static void function() {
        Scanner scnr = new Scanner(System.in);
        String name;

        name = scnr.next();

        System.out.println("Hey " + name + "!");
        System.out.println("Welcome to zyBooks!");
        scnr.close();
    }
    
    public static void main(String[] args) {
        function();
    }
}
