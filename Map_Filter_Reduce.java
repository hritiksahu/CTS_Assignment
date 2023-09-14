import java.util.Arrays;
import java.util.List;

public class Map_Filter_Reduce {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("mumbai","bangalore","chennai");
        String ans=list.stream().map(String::toUpperCase).filter(s->s.length()>=4).reduce("",(remaining,str)->remaining + str);
        System.out.println(ans);

    }
}
