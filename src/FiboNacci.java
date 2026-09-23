public class FiboNacci {

    static void main() {
        //IO.println(fibo(3));
        fiboSeries(5);
    }

    private static int fibo(int n) {
        if(n <= 1) {
            return n;
        }
        return fibo(n-2) + fibo(n-1);
    }

    /**
     * show the fibonacci series
     */
    private static void fiboSeries (int n) {
        for(int i=0; i<n; i++) {
            IO.print(fibo(i) + " ");
        }
    }

}
