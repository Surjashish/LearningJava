package LeetCode;


public class StringCompression {
    public int compress(char[] chars) {
        char c = chars[0];
        int groupCount = 1;
        int j=0;
       for(int i=1;i<chars.length;i++)
       {
           char temp=chars[i];
           if (temp==c)
           {
               groupCount++;
           }
           else
           {
               j++;
               j=j+(int) Math.floor(Math.log10(groupCount)+1);
               groupCount=1;
               c=temp;
           }
       }
        System.out.println(j);
       return j;
    }
}
