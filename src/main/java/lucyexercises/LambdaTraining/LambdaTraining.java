package lucyexercises.LambdaTraining;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaTraining {

    public void iterateAndPrint(ArrayList<Integer> list) {
        //Different ways to iterate and print list vars
        if (list == null) {
            return;
        }
        //standard lamba use
        list.forEach( (n) -> { System.out.println(n); } );
        //call using :: keyword
        list.forEach(System.out::println);
        //storing lambda expressions in an object which has only one method
        //with the same number of parameters and the same return type
        Consumer<Integer> method = System.out::println;
        list.forEach( method );
        Consumer<String> methodstr = n -> System.out.println("hello " + n);
        methodstr.accept("Lucy");
        PrintValue<String> exclaim = (s) -> s + "!";
        PrintValue<String> ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
        PrintValue<Integer> add = n -> n+2;
        System.out.println(add.doSomething(5));
    }

    public static void printFormatted(String str, PrintValue<String> format) {
        String result = format.doSomething(str);
        System.out.println(result);
    }

    public static void main(String[] args) {
        LambdaTraining training = new LambdaTraining();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        training.iterateAndPrint(numbers);
    }
}

@FunctionalInterface
interface PrintValue<T> {
    T doSomething(T str);

    default T getValue(T str) {
        return str;
    }
}
