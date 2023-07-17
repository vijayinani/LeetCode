package leetcode_1_to_100;

public class _28_FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        System.out.println(new _28_FindTheIndexOfTheFirstOccurrenceInAString().strStr("sadnotsad", "sad"));
    }

    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        for (int i = 0; i < haystackLength; i++) {
            if (i + needleLength > haystackLength)
                break;
            for (int j = 0; j < needleLength; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j))
                    break;
                if (j == needleLength - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
