public class countOccurences {
    public static void main(String[] args) {
        int count = countOccurences("Deepika", 'D');
        System.out.println("e " + "found " + count + " times");
    }
    private static int countOccurences(String deepika, char e) {
        int count = 0;
        for (int i = 0; i < deepika.length(); i++) {
            if (deepika.charAt(i) == e) {
                count++;
            }
        }
        return count;
    }
}
