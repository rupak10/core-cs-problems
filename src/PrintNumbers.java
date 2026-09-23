public class PrintNumbers {

    static void main() {
        int n = 3;
        printNumberASC(n);
        IO.println();
        printNumberDESC(n);
    }

    private static void printNumberASC(int n) {
        if(n<1) {
            return;
        }
        printNumberASC(n-1);
        IO.print(n+" ");
    }

    private static void printNumberDESC(int n) {
        if(n<1) {
            return;
        }
        IO.print(n+" ");
        printNumberDESC(n-1);
    }
}
