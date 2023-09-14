

import java.util.Arrays;
import java.util.List;


public class Comparator_Lambda {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("city", "state", "London");
        list.stream().sorted().forEach(System.out::println);

    }
}

