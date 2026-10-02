package recursion;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FibGenerator {
    private int n;
    private int result;

    public FibGenerator(int n){
        this.n = n;
        this.result = nthFib(n);
    }

    public int nthFib(int n) {
        Logger.getGlobal().info("Entering fib. n=" + n);
        
        int result = computeFibRecurse(n);
        Logger.getGlobal().info("Exiting fib. return=" + result);
        return result;
    }

    private int computeFibRecurse(int n){
        assert n >= 0 : "n must be non-negative";

        if (n == 1 || n == 2) {
            return 1;
        }else{
            int first = computeFibRecurse(n - 1);
            int second = computeFibRecurse(n - 2);
            int sum = first + second;
            return sum;
        }
    }

    public String toString() {
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println("STARTING");
        Logger.getGlobal().setLevel(Level.OFF);
        FibGenerator x = new FibGenerator(1);
        
        for(int i = 1; i <= 10; i++){
            System.out.println("fib(" + i + ") = " + x.nthFib(i));
        }
    }
}
