public class printPyramidFormat {
    public static void main(String[] args) {
        printPyramidFormat();
    }
    private static void printPyramidFormat() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
