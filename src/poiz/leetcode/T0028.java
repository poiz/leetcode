package poiz.leetcode;

import java.util.Arrays;

public class T0028 {
    public static void main(String[] args) {
        String haystack = "aaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaabb";
        String needle = "aaaaaaaaaaaaaaaaaba";
        System.out.println((new Solution().strStr(haystack,needle)));
        System.out.println(haystack.indexOf(needle));
    }

    static class Solution {
        public int strStr(String haystack, String needle) {
            if (haystack == null || haystack == "" || needle == null || needle == "") return 0;
            char[] h = haystack.toCharArray();
            char[] n = needle.toCharArray();
            for (int i = 0; i < h.length - n.length + 1; i++) {
                boolean match = true;
                for (int j = 0; j < n.length; j++) {
                    if (h[i + j] != n[j]) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return i;
                }
            }
            return -1;
        }
    }
}
