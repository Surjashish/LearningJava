package dataStructureFull.Recursion;

public class Fibonacci {

    static int fibonacciNos(int n){

        if (n<0)
            return -1;
        if (n==0 || n==1)
            return n;
        return fibonacciNos(n-1)+fibonacciNos(n-2);
    }
    public static void main(String[] args) {

        System.out.println(fibonacciNos(5));
    }
}
