package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class sumTarget {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>a=new HashMap<>();
        for (int i=0;i< nums.length;i++)
        {

            if (a.containsKey(target-nums[i]))
            {
                if (target-nums[i]==nums[i])
                    return new int[]{a.get(nums[i]),i};
                a.put(nums[i],i);

                return new int[]{a.get(nums[i]),a.get(target-nums[i])};
            }
            a.put(nums[i],i);



        }
        return null;
    }
    public static void main(String[] args) {
        sumTarget sumTarget=new sumTarget();
        System.out.println(Arrays.toString(sumTarget.twoSum(new int[]{3, 2,4}, 6)));

    }
}
