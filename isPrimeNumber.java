public class isPrimeNumber {
    public static void main(String[] args) {
        isPrimeNumber(6);
    }
    private static void isPrimeNumber(int value) {
        int i = 2;
        boolean flag = false;
        while (i < value / 2) {
            if (value % i == 0) {
                flag = true;
                break;
            }
            i++;
        }
        if (flag)
            System.out.println("not prime");
        else
            System.out.println("prime");
    }

}
