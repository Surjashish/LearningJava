package Codility;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public static void main(String[] args) {
        String para = "ram ram is a god god god";
        String[] wordsArray = para.split(" ");
        Map<String,Integer> wordMap=new HashMap<>();
        for (String word:wordsArray)
        {
            if (wordMap.containsKey(word))
                wordMap.put(word,wordMap.get(word)+1);
            else
                wordMap.put(word,1);
        }
        System.out.println(wordMap);
    }
}
