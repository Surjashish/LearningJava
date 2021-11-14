package coreJava.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorAnonymousClass {
    public static void main(String[] args) {
        ArrayList<Integer> intList=new ArrayList<>();
        intList.add(2549);
        intList.add(23);
        intList.add(12);
        intList.add(244);
        intList.add(2321);

        Comparator<Integer> comparator=new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                return ((o1%10>o2%10)?1:-1);
            }
        };
        Collections.sort(intList,comparator);
        System.out.println(intList);

    }
}
