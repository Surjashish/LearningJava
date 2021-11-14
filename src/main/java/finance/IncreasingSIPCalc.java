package finance;

public class IncreasingSIPCalc {

    public static double Amount(int P, double r, int n, int inc_per_year_percent)
    {
        double amt_fin=0.0;
        double netPrincipal=P*12;
        double net_invested=0.0;
        for (int i=1;i<=n;i++)
        {
            if(i==1)
            {
                netPrincipal=netPrincipal;
                net_invested=net_invested+netPrincipal;
            }
            else
            {
                netPrincipal=netPrincipal*(100+inc_per_year_percent)/100;
                net_invested=net_invested+netPrincipal;

            }
            amt_fin=(amt_fin+netPrincipal)*(100+r)/100;
        }

        System.out.println("net invested "+net_invested);
        System.out.println("percent increase:"+(amt_fin-net_invested)/net_invested*100);

        return amt_fin;
    }
    public static void main(String[] args) {

        double net_amount=0.0;
        net_amount=Amount(30000,12,10,5);
        System.out.println(net_amount);

    }

}
