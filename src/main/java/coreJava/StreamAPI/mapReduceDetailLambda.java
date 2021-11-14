package coreJava.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class mapReduceDetailLambda {
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(1,2,3,4,5,6);

        Stream<Integer> s=values.stream();
        Function<Integer,Integer> f = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        };

        BinaryOperator<Integer> b=new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };

        //Replacing the above as Lambda expressions

        Stream<Integer> s1= s.map( (integer) -> integer*2 );
        Integer result= s1.reduce(0,(i,j)->i+j); //i is carry here and j is the value to be added. 0 is the inintial value that takes place of i


        System.out.println(result);
    }

}
