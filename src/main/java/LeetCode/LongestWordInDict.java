package LeetCode;

import java.util.*;

//aim at less than 10ms
public class LongestWordInDict {
    public String longestWord(String[] words) {
        String result = "";
        // O(nlogn)
        Arrays.sort(words);
        Set<String> set = new HashSet<>();
        // Assuming no empty string in the words.
        for (String word : words) {
            int length = word.length();
            if (length == 1 || set.contains(word.substring(0, length - 1))) {
                set.add(word);
                // Sorted alphabetically, So same length smaller in front.
                result = length > result.length() ? word : result;
            }
        }

        return result;
    }
}
