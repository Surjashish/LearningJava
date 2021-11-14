package dataStructureFull.Recursion;

public class Factorial {
    static int findFactorial(int n)
    {
        if(n<0)
            return -1;
        if (n == 0 || n == 1)
            return 1;
        else
            return n*findFactorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }
}
