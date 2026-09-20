import java.util.Scanner;

public class LabProgram{
    public static void function() {
        Scanner scnr = new Scanner(System.in);
        double age;
        double weight;
        double heartRate;
        double time;
        double Calories;

        age = scnr.nextInt();
        weight = scnr.nextInt();
        heartRate = scnr.nextInt();
        time = scnr.nextInt();

        Calories = (age * 0.2757 + weight * 0.03295 + heartRate * 1.0781 - 75.4991) * time / 8.368;
        
        System.out.print("Calories: ");
        System.out.printf("%.2f", Calories);
        System.out.println(" calories");
        scnr.close();
    }
    
    public static void main(String[] args) {
        function();
    }
}
