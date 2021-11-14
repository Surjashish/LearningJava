package dataStructureFull.Recursion;

public class ReverseString {
    static String reverseAString(String str) {

        if (str.length() == 1)
            return str;

        //Calling function recursively
        return reverseAString(str.substring(1)) + str.charAt(0);
    }

    static  void justTestingSomething(String s){
        System.out.println(s.substring(1));
        //This means that if a string size is 1 then if we do a substring of 1 then we will be getting a null string.
    }

    public static void main(String[] args) {
        System.out.println(reverseAString("hemlo"));

        justTestingSomething("q");

    }
}
