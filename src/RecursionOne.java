public class RecursionOne {

    static void main() {
        int n = 3;
        IO.println(factorial(n));
    }

    private static int factorial(int n) {
        if(n <= 1) {
            return n;
        }
        return n*factorial(n-1);
    }
}
