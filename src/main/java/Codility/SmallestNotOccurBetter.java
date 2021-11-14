package Codility;

import java.util.Arrays;

public class SmallestNotOccurBetter {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int[] B=new int[A.length];
        int count=0;
        int count2=1;
        for (int i=0;i<A.length;i++)
        {
            if (A[i]>0)
            {
                if (count!=0)
                {
                    if (B[count-1]!=A[i])
                    {
                        B[count]=A[i];
                        count++;
                    }
                }
                else {
                    B[count]=A[i];
                    count++;
                }

            }
        }
        if(count==0)
            return 1;
        else
        {
            while (count2<=count)
            {
                if (B[count2-1]!=count2)
                    return count2;
                count2++;
            }
        }
        return count2;

    }
}
