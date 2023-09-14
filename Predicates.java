import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicates {

    public static void main(String[] args) {
        // Checking number is even/odd
        Predicate<Integer> pred=num->num%2==0;
        System.out.println(pred.test(11));

        //Checking String length is >5
        Predicate<String> pred2=str->str.length()>5;
        System.out.println(pred2.test("hritik"));

        List<String> list= Arrays.asList("hritik","rahul","shivam");
        BiPredicate<String,Integer> biPredicate=(str,length)->length%2==0 && length>5;
        List<String> ans=list.stream().filter(str->biPredicate.test(str,str.length())).collect(Collectors.toList());
        System.out.println(ans);



    }
}
