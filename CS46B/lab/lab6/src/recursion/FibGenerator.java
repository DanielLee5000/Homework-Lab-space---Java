package recursion;

public class FibGenerator {
    private int n;
    private int result;

    public FibGenerator(int n){
        this.n = n;
        this.result = nthFib(n);
    }

    public int nthFib(int n) {
        return computeFibRecurse(n);
    }

    private int computeFibRecurse(int n){
        assert n >= 0 : "n must be non-negative";

        if (n == 1 || n == 2) {
            return 1;
        }


        return computeFibRecurse(n - 1) + computeFibRecurse(n - 2);
    }

    public String toString() {
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println("STARTING");

        FibGenerator x = new FibGenerator(1);
        
        for(int i = 500; i <= 510; i++){
            System.out.println("fib(" + i + ") = " + x.nthFib(i));
        }
    }
}
