package recursion;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FibGenerator {
    private int result;
    public static int[] knownFibonacciValues = new int[100];
    private int[] callCounter = new int[100];

    public FibGenerator(int n){
        this.result = nthFib(n);
    }

    public int nthFib(int n) {
        Logger.getGlobal().info("Entering fib. n=" + n);

        callCounter = new int[n + 1];
        
        int result = computeFibRecurse(n);
        Logger.getGlobal().info("Exiting fib. return=" + result);

        return result;
    }

    private int computeFibRecurse(int n){
        assert n >= 0 : "n must be non-negative";
        callCounter[n]++;

        if (knownFibonacciValues[n] != 0) {
            return knownFibonacciValues[n];
        }else{
            if (n == 1 || n == 2) {
                return 1;
            }else{
                int first = computeFibRecurse(n - 1);
                int second = computeFibRecurse(n - 2);
                int sum = first + second;

                knownFibonacciValues[n] = sum;
                return sum;
            }
        }
    }

    public void printCallCount(int n) {
        System.out.println(callCounter[n] + " calls to fib(" + n + "): ");
    }

    public String toString() {
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println("STARTING");
        Logger.getGlobal().setLevel(Level.OFF);
        FibGenerator x = new FibGenerator(1);
        
        for(int i = 1; i <= 20; i++){
            System.out.println("fib(" + i + ") = " + x.nthFib(i));
            x.printCallCount(i);
        }
    }
}
