package LeetCode;

/**
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse Integer.
 * Memory Usage: 36.1 MB, less than 56.26% of Java online submissions for Reverse Integer.
 * @author Surjashish
 * @param - integer to be reversed and checked
 */
public class IntegerRevM2 {
    public long reverse(int x) {
        long rev = 0;
        byte c = -1;
        if (x < 0) {
            c = 1;
            x *= -1;
        }

        while (x / 10 > 0) {
            rev = rev * 10 + (x % 10);
            x /= 10;
        }
        rev = rev * 10 + x;
        rev = c * -1 * rev;

        return (rev<=Integer.MAX_VALUE && rev>=Integer.MIN_VALUE)?(int)rev:0;
    }



}
