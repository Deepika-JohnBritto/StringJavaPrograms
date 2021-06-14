import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class removeNumbersFromStringUSingPattern {
    public static void main(String[] args) {
        removeNumbersFromStringUSingPattern();
    }
    private static void removeNumbersFromStringUSingPattern() {
        String str = "Deepika345Reg";
        Pattern p = Pattern.compile("\\D+");
        Matcher m = p.matcher(str);
        if (m.find())
            System.out.println(m.group());
    }

}
