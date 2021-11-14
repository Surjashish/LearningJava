package justForFun;

public class factors {
    public static void main(String[] args) {
        int i,c=0;int num=1938;
        for(i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                c++;
                System.out.print(" "+i);

            }
        }
        System.out.println();
        System.out.println("Total factors = "+c);
    }
}
