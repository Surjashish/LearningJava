package Codility;

import java.util.*;

public class SmallestNotOccurInt {
    public int solution(int[] A) {
        int count =0;
        // write your code in Java SE 8
        Set<Integer> posNos=new TreeSet<>();
        for (int i=0;i<=A.length-1;i++)
        {
            if (A[i]>0)
                posNos.add(A[i]);
        }
        if (posNos.size()==0)
            return 1;
        else
        {
            List<Integer> posList = new ArrayList<>(posNos);
            System.out.println(posList);
            while (count<posList.size())
            {
                if (posList.get(count)!=count+1)
                    return count+1;
                count ++;
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
//        int[] A= {1, 3, 6, 4, 1, 2};
        int[] A= {1, 2, 3};

        new SmallestNotOccurInt().solution(A);
    }
}
