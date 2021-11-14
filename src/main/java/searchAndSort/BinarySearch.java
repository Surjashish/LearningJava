package searchAndSort;

//O(logN)
public class BinarySearch {

    public static boolean binarySearchIterative(int[] array, int x){
        int left=0;
        int right = array.length -1;

        while (left <= right){
            int mid = (left + right)/2;
            if (array[mid] == x)
                return true;
            else if (x < array[mid]){
                right = mid -1;
            }
            else
                left=mid+1;
        }
        return false;

    }


    public static boolean binarySearchRecursive(int[] array, int x, int left , int right){

        if (left > right)
            return false;
        int mid = (left + right)/2;  // or to prevent overflow int mid = left + ((right - left)/2);
        if (array[mid] == x){
            return true;

        }
        else if (x < array[mid])
            return binarySearchRecursive(array, x, left,mid-1);
        else
            return binarySearchRecursive(array, x, mid+1,right);

    }

    public static void main(String[] args) {

        int[] arr = {1,4,5,7,8,23,76,234,767,23234};
        System.out.println(binarySearchRecursive(arr,23,0, arr.length-1));
        System.out.println(binarySearchIterative(arr,23));


    }
}
