package backtracking;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";

        //string, left boundary , right boundary
        findPermutations(str, 0 , str.length()-1);
    }

    static void findPermutations(String str , int left, int right){


        if (left == right){
            System.out.println(str);
            return;
        }
        for (int i=left; i<=right;i++){

            //do
            str = swap(str, left , i);

            //recur
            findPermutations(str, left+1, right);

            //undo
            str = swap(str,left,i);
        }
    }

    private static String swap(String str, int left, int i) {

        char t;
        char[] charA = str.toCharArray();
        t = charA[left];
        charA[left] = charA[i];
        charA[i] = t;

        return String.valueOf(charA);

    }
}
