import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateRemove {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("John");
        arr.add("Aisha");
        arr.add("Ravi");
        arr.add("John");
        arr.add("Mina");
        arr.add("Ravi");
        arr.add("Aisha");
        arr.add("Tom");
        Set<String> s = new HashSet<String>(arr);
        System.out.println(s);

    }
}
