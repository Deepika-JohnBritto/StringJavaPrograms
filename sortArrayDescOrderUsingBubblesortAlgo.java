public class sortArrayDescOrderUsingBubblesortAlgo {
    public static void main(String[] args) {
        sortArrayDescOrderUsingBubblesortAlgo();
    }


    private static void sortArrayDescOrderUsingBubblesortAlgo() {
        int a[] = {9, 2, 6, 4, 1};
        int b[] = new int[5];
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }


            }
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}

