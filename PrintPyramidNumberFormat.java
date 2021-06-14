public class PrintPyramidNumberFormat {
    public static void main(String[] args) {
        printPyramidNumberFormat();
    }
    private static void printPyramidNumberFormat() {
        for(int i=1;i<5;i++)
        {
            System.out.println();
            for(int j=1;j<=i;j++)
            {
                System.out.print("\t");
                System.out.print(j);

            }

        }
    }
}
