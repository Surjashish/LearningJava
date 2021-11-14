package coreJava.Comparator;

import java.util.ArrayList;
import java.util.Collections;


public class ComparatorWithLambda {
    public static void main(String[] args) {
        ArrayList<Integer> intList=new ArrayList<>();
        intList.add(2549);
        intList.add(23);
        intList.add(12);
        intList.add(244);
        intList.add(2321);


        Collections.sort(intList,((o1, o2) -> o1 %10 >o2 %10 ? 1:-1));
        System.out.println(intList);


    }
}
