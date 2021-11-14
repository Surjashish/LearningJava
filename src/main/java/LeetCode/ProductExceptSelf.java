package LeetCode;

import java.util.Arrays;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        int prod = Arrays.stream(nums).parallel().filter(o -> o !=0).reduce(1, (c, e) -> c * e);
        int count= (int) Arrays.stream(nums).parallel().filter(o -> o==0).count();
        int[] a = new int[nums.length];
        if (count >1)
            return a;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
            {
                Arrays.fill(a,0);
                a[i] = prod;
                return a;
            }
            else
                a[i]=prod/nums[i];
        }
        return a;


    }
}
