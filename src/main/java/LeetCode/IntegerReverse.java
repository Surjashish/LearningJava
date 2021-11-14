package LeetCode;

public class IntegerReverse {
    public int reverse(int x) {
        byte c = -1;
        int rev = 0;
        if (x < 0) {
            c = 1;
            x = x * -1;
        }
        ;
        try {
            String num = Integer.toString(x);
            StringBuilder s = (c == 1) ? new StringBuilder("-" + new StringBuilder(num).reverse()) : new StringBuilder(num).reverse();
            rev = Integer.parseInt(s.toString());
        } catch (Exception e) {
            System.out.println(e);
            rev = 0;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(new IntegerReverse().reverse(-234234));
    }
}
