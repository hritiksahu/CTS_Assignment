import java.util.function.Function;

public class Function_Composition {

    public static void main(String[] args) {

        Function<Integer,Integer> multiply=(num)->num*2;
        System.out.println(multiply.apply(5));

        Function<Integer,Integer> add=(num)->num+2;
        System.out.println(add.apply(5));

        Function<Integer,Integer> multiplyThenAdd=multiply.andThen(add);
        Integer result=multiplyThenAdd.apply(6);
        System.out.println("Ans is: "+result);
    }
}
