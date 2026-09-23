public class RecursionOne {

    static void main() {
        IO.println(factorial(3));
        IO.println(countDigit(123));
    }

    private static int countDigit(int n) {
        if(n < 10) {
            return 1;
        }
        return 1 + countDigit(n/10);
    }

    private static int factorial(int n) {
        if(n <= 1) {
            return n;
        }
        return n*factorial(n-1);
    }

}
