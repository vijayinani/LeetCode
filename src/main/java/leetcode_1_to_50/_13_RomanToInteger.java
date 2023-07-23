package leetcode_1_to_50;

import java.util.HashMap;
import java.util.Map;

public class _13_RomanToInteger {
    public static void main(String[] args) {
        System.out.println(new _13_RomanToInteger().romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {

        int result = 0;

        Map<Character, Integer> romanToInteger = new HashMap<>();
        romanToInteger.put('M', 1000);
        romanToInteger.put('D', 500);
        romanToInteger.put('C', 100);
        romanToInteger.put('L', 50);
        romanToInteger.put('X', 10);
        romanToInteger.put('V', 5);
        romanToInteger.put('I', 1);

        int n = s.length();
        for (int i = 0; i < n - 1; i++) {
            char currChar = s.charAt(i);
            char nextChar = s.charAt(i + 1);
            if (romanToInteger.get(currChar) >= romanToInteger.get(nextChar)) {
                result += romanToInteger.get(currChar);
            } else {
                result -= romanToInteger.get(currChar);
            }
        }
        result += romanToInteger.get(s.charAt(n - 1));
        return result;
    }
}
