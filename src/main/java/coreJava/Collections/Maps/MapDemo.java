package coreJava.Collections.Maps;

import sun.awt.image.ImageWatched;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {

        //HashMap demo
        Map<String,Integer> studmarks=new LinkedHashMap<>();
        studmarks.put("A", 20);
        studmarks.put("B",56);
        studmarks.put("Z",90);
        studmarks.put("D",30);
        studmarks.put("C",320);
        System.out.println("Initial HashMap "+studmarks);
        //TreeMap Demo
        Map<String,Integer> studmarksSorted = new TreeMap<>();
        studmarksSorted.putAll(studmarks);
        System.out.println("sorted "+studmarksSorted.entrySet());



    }
}
