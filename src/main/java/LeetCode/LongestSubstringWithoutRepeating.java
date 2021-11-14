package LeetCode;

import java.util.*;

public class LongestSubstringWithoutRepeating {
//    static int lengthOfLongestSubstring(String s) {
//        List<Character> list=new ArrayList<>();
//        int maxLength=0;
//        for (int i=0;i<s.length();i++)
//        {
//            char c=s.charAt(i);
//            if (list.contains(c))
//            {
//                if (list.size()>maxLength)maxLength= list.size();
//
//                while (list.contains(c))
//                {
//                    list.remove(0);
//                }
//                list.add(c);
//
//            }
//            else
//            {
//                list.add(c);
//                if (list.size()>maxLength)maxLength= list.size();
//
//            }
//        }
//
//        return maxLength;
//
//    }
    static int lengthOfLongestSubstring(String s) {
        Deque<Character> deque=new LinkedList<>();
        int maxLength=0;
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if (deque.contains(c))
            {
                if (deque.size()>maxLength)maxLength= deque.size();

                while (deque.contains(c))
                {
                    deque.removeFirst();
                }
                deque.add(c);

            }
            else
            {
                deque.add(c);
                if (deque.size()>maxLength)maxLength= deque.size();

            }
        }

        return maxLength;

    }

    public static void main(String[] args) {
        System.out.println( lengthOfLongestSubstring("jlygy"));
    }
}
