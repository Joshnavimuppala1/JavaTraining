import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortPrint {
    public static void main(String[]args){
        List<Integer> numbers = Arrays.asList(4,6,8,3,10,2,1,5,7);
        List<Integer> sort = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sort);

    }
}
