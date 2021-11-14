package dataStructureFull.Recursion;

public class demo1 {

    static  void recursionMethod(int n){
        if(n<1)
        {
            System.out.println(n+" is less than 1");
        }else
        {
            recursionMethod(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        recursionMethod(5);
    }
}
