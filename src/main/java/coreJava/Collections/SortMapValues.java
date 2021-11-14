package coreJava.Collections;

import java.util.*;

public class SortMapValues {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("A", 20);
        map.put("B",56);
        map.put("C",30);
        map.put("D",30);
        ArrayList<Map.Entry<String,Integer>> studentMarks=new ArrayList<>(map.entrySet());
        Comparator<Map.Entry<String,Integer>> c = (s1,s2) -> {
            if (s1.getValue()== s2.getValue()) return 0;
            else return (s1.getValue()> s2.getValue())?-1:1;
        };
        studentMarks.sort(c);
        System.out.println(studentMarks);

    }
}
