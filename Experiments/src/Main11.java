import java.util.ArrayList;
import java.util.Collections;

public class Main11 {

    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        Collections.sort(items);
        int index = Collections.binarySearch(items, "fghf");
        System.out.println(index);
    }
}
