package coreJava.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Here we are using another class instead of anonymous class. In forEachDemo3, we shall use Lambda expression to further reduce boiler plate code.

class CC implements Consumer<Integer>
{

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}
public class forEachDemo2 {
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(1,2,3,4,5,6);

        Consumer<Integer> c = new CC();
        values.forEach(c);
    }
}
