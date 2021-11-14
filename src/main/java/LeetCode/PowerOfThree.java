package LeetCode;

public class PowerOfThree {
    /**
     * @param n
     * @return check if power of three or not
     */
    public boolean isPowerOfThree(int n) {
        int k=n;

        while (k > 1) {
            if (k % 3 != 0)
                return false;

            k = k / 3;
        }
        return k == 1;

    }
}
