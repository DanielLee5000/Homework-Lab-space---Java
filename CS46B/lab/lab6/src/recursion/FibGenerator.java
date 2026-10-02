package recursion;

public class FibGenerator {
    private int n;
    private double result;

    public FibGenerator(int n){
        this.n = n;
        this.result = nthFib(n);
    }

    public double nthFib(int n) {
        return computeFibRecurse(n);
    }

    private double computeFibRecurse(int n){
        assert n >= 0 : "n must be non-negative";

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return computeFibRecurse(n - 1) + computeFibRecurse(n - 2);
    }

    public String toString() {
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);

        FibGenerator x = new FibGenerator(0);
        
        for(int i = 1; i <= 32; i++){
            System.out.println(x.nthFib(i));
        }
    }
}
