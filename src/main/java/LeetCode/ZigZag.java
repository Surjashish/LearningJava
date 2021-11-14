package LeetCode;


public class ZigZag {
    public String convert(String s, int numRows) {
        char[][] arr=new char[numRows][s.length()];
        short column=0;short row=0;
        boolean inc =true;short count=0;
        if (numRows==1)return s;
        while (column<s.length())
        {
            while (inc)
            {
                if (count==s.length())break;
                arr[row][column]=s.charAt(count);
                row++;
                count ++;
                column++;
                if (row==numRows-1)
                    inc=false;
            }
            while (!inc)
            {
                if (count==s.length())break;
                arr[row][column]=s.charAt(count);
                row--;
                column++;
                count++;
                if (row==0)
                    inc=true;
            }
        }
        String result = "";
        for (short i=0;i<numRows;i++)
        {
            for(short j=0;j<s.length();j++)
            {
                if (Character.isLetter(arr[i][j]) || arr[i][j]=='.' || arr[i][j]==',' )result+=arr[i][j];
            }

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new ZigZag().convert("PAYPALISHIRING",3));
    }
}
