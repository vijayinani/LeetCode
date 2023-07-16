package leetcode;

import java.util.HashSet;
import java.util.Set;

public class _3_LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        Set<Character> occurredChars = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
//            if(!occurredChars.contains(s.charAt(right))) {
//                occurredChars.add(s.charAt(right));
//                maxLength = Math.max(maxLength, right -left + 1);
//            } else {
//                while(occurredChars.contains(s.charAt(right))) {
//                    occurredChars.remove(s.charAt(left));
//                    left++;
//                }
//                occurredChars.add(s.charAt(right));
//            }

            while (!occurredChars.add(s.charAt(right))) {
                occurredChars.remove(s.charAt(left++));
            }
            occurredChars.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(new _3_LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(" "));
    }

}
