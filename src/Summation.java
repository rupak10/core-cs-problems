public class Summation {

    static void main() {
        int n = 3;
        IO.println("Summation from 1 to "+n+": "+sum(n));
    }

    private static int sum(int n) {
        if(n <= 1) {
            return n;
        }
        return n + sum(n-1);
    }
}
