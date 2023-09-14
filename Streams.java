import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args){

        List<Integer> list= Arrays.asList(15,4,3,2,1);
        List<Integer> oddnumber=list.stream().filter(n1->n1%2==1).collect(Collectors.toList());
        oddnumber.forEach(System.out::println);

    }
}
