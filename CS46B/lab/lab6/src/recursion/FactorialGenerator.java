package recursion;

public class FactorialGenerator {
    private int n;
    private long result;

    public FactorialGenerator(int n){
        this.n = n;
        this.result = nthFactorial(n);
    }

    public long nthFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        if (n == 0) {
            return 1;
        }
        return computeFactorialRecurse(n);
    }

    private long computeFactorialRecurse(int n){
        if (n == 0) {
            return 1;
        }
        return n * computeFactorialRecurse(n - 1);
    }

    public String toString() {
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        FactorialGenerator x = new FactorialGenerator(6);
        System.out.println(x.toString());
    }
}
