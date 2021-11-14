package coreJava.StreamAPI;

import java.util.Arrays;
import java.util.List;

//this uses lambda expression to print values
public class forEachDemo3Lambda {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

        values.forEach(integer -> {
            if (integer % 2 == 0) {
                System.out.println(integer * integer);
            } else System.out.println(integer ^ 3);

        });
    }

}
