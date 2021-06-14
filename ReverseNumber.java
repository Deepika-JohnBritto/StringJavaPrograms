public class ReverseNumber {
    public static void main(String[] args) {
        reverseNumber();
    }

    private static void reverseNumber() {
        int a = 856;
        int reverse = 0;
        while (a != 0) {
            int digit = a % 10;
            a = a / 10;
            reverse = digit + reverse * 10;

        }
        System.out.println(reverse);
        if (a == reverse)
            System.out.println("palindrome");
        else
            System.out.println("not pali");
    }
}
