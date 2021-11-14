package justForFun;

public class primeFactorization {
    public static void main(String[] args) {
        int i,c,j=0;int num=343;
        for (i=1;1<=num;i++)
        {
            if(num%i==0)
            {
                System.out.println("fac "+i);
                num=num/i;
                i=1;
            }
        }
    }
}
