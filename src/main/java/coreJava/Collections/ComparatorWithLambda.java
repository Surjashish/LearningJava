package coreJava.Collections;

import java.util.*;

public class ComparatorWithLambda {
    public static void main(String[] args) {
        Map<String,Integer> nameMarks=new HashMap<>();
        nameMarks.put("A", 20);
        nameMarks.put("B",56);
        nameMarks.put("C",30);
        nameMarks.put("D",30);

        List<Map.Entry<String,Integer>> marksList =new ArrayList<>(nameMarks.entrySet());
        Collections.sort(marksList,(studMark1,studMark2) -> {return studMark1.getValue()>studMark2.getValue()?1:-1;});
        System.out.println(marksList);

    }
}
