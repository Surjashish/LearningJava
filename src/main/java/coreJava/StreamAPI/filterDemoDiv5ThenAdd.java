package coreJava.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class filterDemoDiv5ThenAdd {
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(25,22,66,63,75,95);

        Predicate<Integer> p=new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 5 == 0;
            }
        };
        System.out.println(values.stream().filter(i -> i%5==0).reduce(0,Integer::sum));
    }
}
