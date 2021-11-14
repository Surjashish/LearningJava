package LeetCode;

public class GenerateValidParanthesis {


    public static void paranthesis(char arr[], int pos, int n, int open, int close) {

        if (open > close) {

            arr[pos] = ')';
            paranthesis(arr, pos + 1, n, open, close + 1);
        }
        if (open < n) {
            arr[pos] = '(';
            paranthesis(arr, pos + 1, n, open + 1, close);

        }

        if (close == n) {
            System.out.println(arr);

        }
    }

    public static void main(String[] args) {

        int n = 4;
        char[] arr = new char[2 * n];
        paranthesis(arr, 0, n, 0, 0);
    }


}
