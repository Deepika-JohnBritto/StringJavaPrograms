import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadSpecifictextFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        ReadSpecifictextFromFile();
    }

    private static void ReadSpecifictextFromFile() throws FileNotFoundException {
        String searchKey = "Deepika";
        String result = "";
        Scanner s = new Scanner(new BufferedReader(new FileReader("C:\\Users\\johnb\\Deepika\\CodingPractice\\src\\main\\resources\\junkText")));
        while (s.hasNextLine()) {
            String nextLine = s.nextLine();
            if (s.nextLine().contains(searchKey)) {
                result = nextLine.substring(nextLine.indexOf(searchKey));
                System.out.println(result.replaceAll("[^Deepika]", ""));
            }
        }
    }
}
