public class RemoveNumbersFromString {
    public static void main(String[] args) {
        removeNumbersFromString();
    }
        private static void removeNumbersFromString() {
            String str = "Deepi123ka@#$%";
            str = str.replaceAll("[A-Z a-z #$%@]", "");
            System.out.println(str);

    }
}
