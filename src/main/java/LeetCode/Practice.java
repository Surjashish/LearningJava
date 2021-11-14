package LeetCode;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        String maxString = "",temp="";
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            temp+=c;
            for (int j=i+1;j<s.length();j++)
            {
                if (temp.indexOf(s.indexOf(j))==-1)
                    temp+=s.indexOf(j);
                else
                { maxString=temp; temp="";}

            }

        }
        return maxString.length();

    }
}
public class Practice {
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abcabc"));
    }
}
