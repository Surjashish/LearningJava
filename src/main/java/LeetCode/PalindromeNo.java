package LeetCode;

public class PalindromeNo {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        StringBuilder num = new StringBuilder(Integer.toString(x));
        System.out.println(num + " " + num.reverse());
        if (num == num.reverse())return true;
        else
            return false;
    }

    public static void main(String[] args) {
        new PalindromeNo().isPalindrome(10);
    }
}
