package LeetCode;

public class LongestPalindromicString {
    public String longestPalindrome(String s) {
        String rev = "";
        for (short i = (short) (s.length() - 1); i >= 0; i--)
            rev += s.charAt(i);
        String maxPalin = "";
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            String c=s.charAt(i)+"";
            if (rev.contains(temp+c))
            {
                temp+=c;
                StringBuilder tempRev=new StringBuilder(temp);
                tempRev.reverse();
                if (temp.length()>maxPalin.length() && temp.equals(tempRev.toString()))
                    maxPalin=temp;
            }
            else
            {
                while (!rev.contains(temp+c))
                    temp=temp.substring(1);
                i--;

            }

        }
        return maxPalin;
    }
}
