package LeetCode;

public class MostWaterContainer {
    public int maxArea(int[] height) {

        int maxArea=Integer.MIN_VALUE;
        int left=0;
        int right = height.length-1;
        while (left < right)
        {
            int shorter = Math.min(height[left],height[right]);
            int base = right-left;
            maxArea= Math.max(maxArea, (shorter * base));
            if (height[left]<height[right])
                left++;
            else
                right--;


        }
        return maxArea;
    }
}
