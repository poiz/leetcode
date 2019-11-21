package poiz.leetcode;

public class T0014 {
    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(new String[]{"cc", "ccc"}));
    }

    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length < 1) return "";
            if (strs.length == 1) return strs[0];
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int i = 0; i <  strs.length; i++) {
                if (min > strs[i].length()) {
                    min = strs[i].length();
                    minIndex = i;
                }
            }
            int i = 0;
            while (i < min) {
                char c = ' ';
                for (String s : strs) {
                    if (c == ' ') {
                        c = s.charAt(i);
                    } else {
                        if (c != s.charAt(i)) {
                            return strs[0].substring(0, i);
                        }
                    }
                }
                i++;
            }
            return strs[minIndex];
        }
    }
}
