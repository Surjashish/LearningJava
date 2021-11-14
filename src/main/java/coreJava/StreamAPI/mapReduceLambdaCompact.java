package coreJava.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class mapReduceLambdaCompact {
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(1,2,3,4,5,6);

        Stream<Integer> s=values.stream();


        //Replacing the above as Lambda expressions


        Integer result2=values.stream().map(i -> i*2).reduce(0,(c,e)->c+e);

        System.out.println(result2);
    }

}
