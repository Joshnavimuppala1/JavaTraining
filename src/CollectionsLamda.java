import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class CollectionsLamda {
    public static void main(String[]args){
        String[] str = {"apple","banana","orange","apple","mango"};
        Map<String,Long> count= Arrays.stream(str) .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(count);

    }
}
