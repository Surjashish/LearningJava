package coreJava.Comparator;

import java.util.*;

class CompImpl implements Comparator<Map.Entry<String, Integer>>
{

    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return (o1.getValue()> o2.getValue()?1:-1);
    }
}
public class ComparatorSeparateClass {
    public static void main(String[] args) {
        Map<String,Integer> studmarks=new HashMap<>();
        studmarks.put("A", 20);
        studmarks.put("B",56);
        studmarks.put("C",30);
        studmarks.put("D",30);
        ArrayList<Map.Entry<String, Integer>> studMarksList=new ArrayList<>(studmarks.entrySet());
        Collections.sort(studMarksList,new CompImpl());
        System.out.println(studMarksList);

    }
}
