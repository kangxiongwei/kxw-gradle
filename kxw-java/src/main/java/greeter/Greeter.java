package greeter;

/**
 * Create by kangxiongwei on 2018/6/28 11:09.
 */
public class Greeter {

    public static void main(String[] args) {
        final String output = GreetingFormatter.greeting(args[0]);
        System.out.println(output);
    }

}
