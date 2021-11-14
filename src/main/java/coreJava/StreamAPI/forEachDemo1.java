package coreJava.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class forEachDemo1 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

        //Java 1.8
        //Creating object of Reference Consumer and type of anonymous class ....
        // We could also have created another class which implemented Consumer and define the method
        // below and pass that class here, but we are using anonymous class for our benefit.
        // Next we shall progress towards lamba expression.
        //in forEachDemo2, we shall be using a separate class instead of using an anonymous class.
        Consumer<Integer> c = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        values.forEach(c);
    }
}
