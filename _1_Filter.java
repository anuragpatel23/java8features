import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _1_Filter {
    public static void main(String... args){
        List<Integer> nums= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> result = nums.stream()
                                .filter(n->n>5)
                                .collect(Collectors.toList());
        System.out.println(result.toString());
    }
}
