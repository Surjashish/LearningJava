package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
    public String intToRoman(int num) {
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9 ,5, 4, 1};
        String[] code = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String sb = "";
        for(int i = 0; i < value.length; i++){

            while(value[i] <= num){
                sb=sb+(code[i]);
                num -= value[i];
            }
        }
        return sb.toString();
    }
}
