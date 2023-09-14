import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Consumer_Supplier {
    public static void main(String[] args) {

        //Consumer that prints the string it receives
        Consumer<String> consumer=str->System.out.println(str);
        consumer.accept("Bangalore");

        //Supplier that returns the current date-time as a formatted string
        Supplier<String> datetime=()->{
            LocalDateTime dt= LocalDateTime.now();
            DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            return dt.format(format);
        };
        System.out.println(datetime.get());
    }
}
