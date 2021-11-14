package LeetCode;

import java.util.*;

public class LetterCombinations17 {
    public List<String> letterCombinations(String digits) {
        Map<Character,List<String>> numMap=new HashMap<>();
        numMap.put('2', Arrays.asList("a","b","c"));
        numMap.put('3', Arrays.asList("d","e","f"));
        numMap.put('4', Arrays.asList("g","h","i"));
        numMap.put('5', Arrays.asList("j","k","l"));
        numMap.put('6', Arrays.asList("m","n","o"));
        numMap.put('7', Arrays.asList("p","q","r","s"));
        numMap.put('8', Arrays.asList("t","u","v"));
        numMap.put('9', Arrays.asList("w","x","y","z"));
        List<String> finalList=new ArrayList<>();

        for (short i=0;i<digits.length();i++)
        {
            char digit=digits.charAt(i);
            List<String> tempList=new ArrayList<>();
            if (i==0) {
                tempList.addAll(numMap.get(digit));
                finalList=tempList;
                tempList.clear();
            }
            else
            {
                List<String> digitList=numMap.get(digit);
                for (String alpha:digitList)
                {
                    for (String finalListVal:finalList)
                        tempList.add(finalListVal+alpha);
                }
                finalList=tempList;
                tempList.clear();
            }

        }
        return finalList;




    }

}
