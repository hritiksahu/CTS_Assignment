public class Lambda_SumAndUppercase {
    public static void main(String[] args) {

        Sum add = (x, y) -> x + y;
        int result = add.add(10, 5);
        System.out.println(result);

        UpperCase uppercase=str->str.toUpperCase();
        System.out.println(uppercase.upperCase("hritik"));


    }


    interface Sum {
        int add(int x, int y);
    }

    interface UpperCase {
       String upperCase(String x);
    }

}
