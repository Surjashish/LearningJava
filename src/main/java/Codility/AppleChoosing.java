package Codility;

import java.util.ArrayList;
import java.util.List;

public class AppleChoosing {
    public int solution(int[] A, int K, int L) {
        // write your code in Java SE 8
        int lenA=A.length;

        if (lenA<K+L)
            return -1;
        int sumK=0;
        int sumL=0;
        int KStart=Integer.MIN_VALUE;
        int LStart=Integer.MIN_VALUE;
        //K sum max
        for (int i=0;i<=lenA-K;i++)
        {
            int tempSum=0;
            for (int j=0;j<K;j++)
                 tempSum+=A[i+j];
            if (tempSum>sumK) {
                KStart=i;
                sumK = tempSum;
            }
        }
        if (KStart>=L)
        {
            for (int i=0;i<=KStart-L;i++)
            {
                int tempSum=0;
                for (int j=0;j<L;j++)
                    tempSum+=A[i+j];
                if (tempSum>sumL) {
                    LStart=i;
                    sumL = tempSum;
                }
            }
            if (lenA-(KStart+K)>=L)
            {
                for (int i=KStart+K-1;i<=lenA-L;i++)
                {
                    int tempSum=0;
                    for (int j=0;j<L;j++)
                        tempSum+=A[i+j];
                    if (tempSum>sumL) {
                        LStart=i;
                        sumL = tempSum;
                    }
                }
            }
        }
        else
        {
            for (int i=KStart+K-1;i<=lenA-L;i++)
            {
                int tempSum=Integer.MIN_VALUE;
                for (int j=0;j<L;j++)
                    tempSum+=A[i+j];
                if (tempSum>sumL) {
                    LStart=i;
                    sumL = tempSum;
                }
            }
        }
        return sumK+sumL;
    }
}
