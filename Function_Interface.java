import java.util.function.Function;

public class Function_Interface {

    public static void main(String[] args) {
        //Function that takes a string and return its length
        Function<String,Integer> length= str->str.length();
        System.out.println(length.apply("hritik"));

        //Function that takes a string and return its lowercase version
        Function<String,String> length2= str->str.toLowerCase();
        System.out.println(length2.apply("HRITIK"));

    }
}
