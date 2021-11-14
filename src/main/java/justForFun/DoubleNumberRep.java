package justForFun;

import java.util.ArrayList;

public class DoubleNumberRep {
    public static void main(String[] args) {
        ArrayList<Integer>in =new ArrayList<>();
        ArrayList<Integer>in2=new ArrayList<>();

        in.add(7);
        in.add(8);
        ArrayList<Integer> in3 = new ArrayList<>(in);

        while (in3.size()<10)
        {
            for (int a:in)
            {
                System.out.println(Integer.parseInt("7"+ a));
                in2.add(Integer.parseInt("7"+ a));
            }
            for (int a:in)
            {
                in2.add(Integer.parseInt("8"+ a));
            }
            in3.addAll(in2);
            in.clear();
            in.addAll(in2);
            in2.clear();
        }
        System.out.println(in3.subList(0,12));

    }
}
