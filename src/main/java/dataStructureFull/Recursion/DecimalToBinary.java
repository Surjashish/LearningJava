package dataStructureFull.Recursion;

public class DecimalToBinary {

    static String decToBin(int n){

        if (n == 1 || n == 0)
            return n+"";
        return n%2+" " + decToBin(n/2);  //or n%2+10*decToBin(n/2);
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(decToBin(6));
        System.out.println(sb.reverse());
    }
}
