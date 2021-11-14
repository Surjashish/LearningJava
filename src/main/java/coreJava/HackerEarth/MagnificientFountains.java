package coreJava.HackerEarth;

import java.util.*;

public class MagnificientFountains {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner s = new Scanner(System.in);
        int i=s.nextInt();
        int count =0;
        int[] answers=new int[i];

        for (int j=1;j<=i;j++)
        {
            int n=s.nextInt();
            Scanner s1 = new Scanner(System.in);

            String intervals=s1.nextLine();
            List<Integer> intervalList=new ArrayList<>();
            String[] integers=intervals.split(" ");
            for (String integer : integers) intervalList.add(Integer.parseInt(integer));
            Collections.sort(intervalList);
            int lcm=intervalList.get(n-1);
            intervalList.remove(n-1);
            for (int interval : intervalList)
            {
                for (int p=1;p<=interval;p++)
                {
                    if (interval % p ==0)
                    {
                        if (lcm % p !=0)lcm=lcm*p;
                    }
                }
            }
            answers[count]=lcm;
            count++;

        }
        for (int answer : answers) System.out.println(answer);

    }

}
