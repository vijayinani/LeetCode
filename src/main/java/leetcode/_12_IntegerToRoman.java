package leetcode;

public class _12_IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int i = 0;
        while (num > 0) {
            while (num >= values[i]) {
                num -= values[i];
                result.append(roman[i]);
            }
            i++;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new _12_IntegerToRoman().intToRoman(3));
        System.out.println(new _12_IntegerToRoman().intToRoman(58));
        System.out.println(new _12_IntegerToRoman().intToRoman(1994));
    }
}
