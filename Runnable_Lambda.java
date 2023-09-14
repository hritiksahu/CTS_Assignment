public class Runnable_Lambda {

    public static void main(String[] args){
        Thread thread=new Thread(()-> {
            System.out.println("Lambda Runnable in Action!");
        });

        thread.start();
    }
}
