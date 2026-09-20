import java.util.Scanner;

public class LabProgram{
    public static void countMath() {
        Scanner scnr = new Scanner(System.in);
        int userNum;
        int divNum;

        userNum = scnr.nextInt();
        divNum = scnr.nextInt();
        
        System.out.print(userNum / divNum + " ");
        userNum /= divNum;

        System.out.print(userNum / divNum + " ");
        userNum /= divNum;

        System.out.print(userNum / divNum);
        System.out.println();
        scnr.close();
    }
    
    public static void main(String[] args) {
        countMath();
    }
}
