package Codility;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NoOfTimes {
    public static void main(String[] args) {
        Map<Character,Integer> countMap=new HashMap<>();
        String name = "my name is surjashish";
        for (short i=0;i<name.length();i++)
        {
            char letter = name.charAt(i);
            if (countMap.containsKey(letter))
                countMap.put(letter,countMap.get(letter)+1);
            else
                countMap.put(letter,1);

        }
        System.out.println(countMap);
    }
}
