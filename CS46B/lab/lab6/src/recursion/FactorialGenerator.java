package recursion;

public class FactorialGenerator {
    private int n;
    private double result;

    public FactorialGenerator(int n){
        this.n = n;
        this.result = nthFactorial(n);
    }

    public double nthFactorial(int n) {
        return computeFactorialRecurse(n);
    }

    private double computeFactorialRecurse(int n){
        assert n >= 0 : "n must be non-negative";

        if (n == 0) {
            return 1;
        }
        return n * computeFactorialRecurse(n - 1);
    }

    public String toString() {
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);

        FactorialGenerator x = new FactorialGenerator(0);
        
        for(int i = 1; i <= 32; i++){
            System.out.println(x.nthFactorial(i));
        }
    }
}
