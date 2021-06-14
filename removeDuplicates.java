import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class removeDuplicates {
    public static void main(String[] args) throws FileNotFoundException {

        removeDuplicates();

    }

    private static void removeDuplicates() {
        List list = new ArrayList<Integer>();
        int a[] = {4, 5, 5, 4, 6, 7};
        for (int i = 0; i < a.length; i++) {

            if (!list.contains(a[i])) {
                list.add(a[i]);
            }


        }
        System.out.println(list);
    }
}
