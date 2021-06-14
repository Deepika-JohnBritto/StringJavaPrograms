public class printFibonacciseries {
    public static void main(String[] args) {
        printFibonacciseries();
    }
    private static void printFibonacciseries() {
        int i = 0;
        int sum = 0;
        int a = 0;
        int b = 1;
        while (i < 7) {
            sum = a + b;
            a = b;
            b = sum;
            i++;
            System.out.println(sum);
        }
    }
    }
