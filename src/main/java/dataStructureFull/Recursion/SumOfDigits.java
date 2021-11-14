package dataStructureFull.Recursion;

public class SumOfDigits {

    static int findSumOfDigits(int n){

        if (n<0)
            return -1;
        if (n/10==0)
            return n%10;
        return n%10 + findSumOfDigits(n/10);
    }

    public static void main(String[] args) {
        System.out.println(findSumOfDigits(4356));
    }
}
