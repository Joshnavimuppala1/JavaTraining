import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CustomSorting {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Joshnavi","Josh","hlo","Joshna","Muppala","amulya");
        List<String> desc = list.stream()
                .sorted((a,b)->b.compareTo(a)  )
                .collect(Collectors.toList());
        System.out.println(desc);

    }
}
