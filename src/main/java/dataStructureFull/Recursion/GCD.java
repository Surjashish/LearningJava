package dataStructureFull.Recursion;

public class GCD {

    static int findGCDOTwoNos(int a , int b){
        if (a < 0 || b <0)
            return -1;
        if (b == 0)
            return a;
        int c = a%b;
        return findGCDOTwoNos(b,a%b);

    }

    public static void main(String[] args) {
        System.out.println(findGCDOTwoNos(48,18));
    }
}
