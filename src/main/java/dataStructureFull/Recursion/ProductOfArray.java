package dataStructureFull.Recursion;

public class ProductOfArray {

    static int prodOfArray(int[] A,int n){

        if (n==0)
            return A[0];
        return A[n]*prodOfArray(A,n-1);
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4,2};
        System.out.println(prodOfArray(A,A.length-1));
    }
}
