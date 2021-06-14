public class findMinAndMaxNumberInArray {
    public static void main(String[] args) {
        findMinAndMaxNumberInArray();
    }
    private static void findMinAndMaxNumberInArray() {
        int a[] = {4, 5, 9};
        int min = a[0], max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("min num:" + min + " max num:" + max);
    }
}
