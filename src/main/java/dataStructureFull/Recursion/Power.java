package dataStructureFull.Recursion;

public class Power {
    static int findPower(int a, int n){
        if (n < 0 )
            return  -1; //Exceptional case
        if (n==0)
            return 1;
        return a*findPower(a,n-1);
    }

    public static void main(String[] args) {
        System.out.println(findPower(2,5));
    }
}
