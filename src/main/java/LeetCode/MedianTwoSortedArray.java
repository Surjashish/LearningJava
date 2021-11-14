package LeetCode;

/**
 * Runtime: 2 ms, faster than 99.88% of Java online submissions for Median of Two Sorted Arrays.
 * Memory Usage: 40 MB, less than 79.87% of Java online submissions for Median of Two Sorted Arrays.
 * Date - 6.8.21
 */

public class MedianTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        short len1= (short) nums1.length;
        short len2= (short) nums2.length;

        int[] array = new int[len1 + len2];
        short  k = 0;
        short i= (short) ((len1>0)?0:-1);
        short j= (short) ((len2>0)?0:-1);

        while (k<(len1 + len2)) {

            if (i == -1 && j!=-1) {
                array[k] = nums2[j];
                k++;
                j++;
                if (j >= len2) j = -1;
                continue;

            }
            if (j == -1 && i!=-1) {
                array[k] = nums1[i];
                k++;
                i++;
                if (i >= len1) i = -1;
                continue;

            }
            if (i != -1 && j != -1) {
                if (nums1[i] < nums2[j]) {
                    array[k] = nums1[i];
                    k++;
                    i++;
                    if (i >= len1) i = -1;
                    continue;

                }
                if (nums2[j] < nums1[i]) {
                    array[k] = nums2[j];
                    k++;
                    j++;
                    if (j >= len2) j = -1;
                    continue;

                }
                if (nums2[j] == nums1[i]) {
                    array[k] = nums2[j];
                    array[k + 1] = nums1[i];
                    k += 2;
                    i++;
                    j++;
                    if (i >= len1) i = -1;
                    if (j >= len2) j = -1;
                    continue;



                }
            }


        }
        short len= (short) array.length;
        if (len %2 ==0)
        {
            return (double) (array[len / 2]+array[len /2 -1])/2;
        }
        else
        {
            return (double)array[len/2];
        }
    }
}
