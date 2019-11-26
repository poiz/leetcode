package poiz.leetcode;

import java.util.Arrays;

public class T0058 {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord("111111 1111111 ffffffff a        "));
        System.out.println(new Solution().lengthOfLastWord("a"));
    }

    static class Solution {
        public int lengthOfLastWord(String s) {
            if (s == null || s.trim().length() < 1) return 0;
            String[] ss = s.trim().split(" ");
            return ss[ss.length - 1].length();
        }
    }
}
