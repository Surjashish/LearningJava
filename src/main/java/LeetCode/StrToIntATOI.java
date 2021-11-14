package LeetCode;

public class StrToIntATOI {
    public int myAtoi(String s) {
        s = s.trim();
        byte neg = -1;
        if (s.length() == 0) return 0;
        short pos = 0;
        long ans = 0;
        boolean isNum = true;
        if (s.charAt(pos) == '-' || s.charAt(pos) == '+') {
            if (s.charAt(pos) == '-') {
                neg = (byte) (-1 * neg);
                s = s.substring(1);
                if (s.length() == 0) return 0;

            } else {
                if (s.charAt(pos) == '+') {

                    s = s.substring(1);
                    if (s.length() == 0) return 0;

                }
            }

        }

        if (!Character.isDigit(s.charAt(pos))) return 0;
        else {
            while (isNum) {
                ans = ans * 10 + Character.getNumericValue(s.charAt(pos));
                if (-1 * neg * ans < Integer.MIN_VALUE)return Integer.MIN_VALUE;
                else
                {
                    if (-1 * neg * ans > Integer.MAX_VALUE)return Integer.MAX_VALUE;
                }
                pos++;

                if (pos == s.length()) break;
                isNum = Character.isDigit(s.charAt(pos));
            }
            ans = -1 * neg * ans;
            return (ans <= Integer.MAX_VALUE && ans >= Integer.MIN_VALUE) ? (int) ans : (ans < Integer.MIN_VALUE) ?
                    Integer.MIN_VALUE : (ans > Integer.MAX_VALUE) ? Integer.MAX_VALUE : 0;

        }
    }

    public static void main(String[] args) {
        System.out.println(new StrToIntATOI().myAtoi("922337203685477580"));
    }
}

