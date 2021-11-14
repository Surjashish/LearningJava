package coreJava.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class addingStrings {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ramesh","Suresh","Dinesh","Mahesh");
        System.out.println(names.stream().reduce("",(s1,s2)->s1 + " OR "+s2).substring(4).trim() );



        //Old Method
        String addition="";
        for (String name:names)
        {
             addition+=name+" OR ";

        }
        System.out.println(addition.substring(0, addition.lastIndexOf("O")).trim());
    }
}
