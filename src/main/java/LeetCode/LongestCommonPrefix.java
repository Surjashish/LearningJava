package LeetCode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String strToMatch = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String word = strs[i];
            if (!word.startsWith(strToMatch)) {
                if (strToMatch.length() == 1)
                    return "";
                strToMatch = strToMatch.substring(0, strToMatch.length() - 1);
                i = 0;
            }
        }
        return strToMatch;
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] arr = {"cir", "car"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(arr));
    }
}
