package poiz.leetcode;

public class T0038 {
    public static void main(String[] args) {
        System.out.println(new Solution().countAndSay(5));
        System.out.println(new Solution().countAndSay(6));
        System.out.println(new Solution().countAndSay(15));
        System.out.println(new Solution().countAndSay(30));
    }

    static class Solution {
        public String countAndSay(int n) {
            if (n < 0 || n > 30) return "0";
            StringBuilder s = new StringBuilder("1");
            while (--n > 0) {
                char[] c = s.toString().toCharArray();
                s = new StringBuilder();
                int i = 0;
                while (i < c.length) {
                    int j = 0;
                    do {
                        j++;
                    } while (i + j < c.length && c[i] == c[i + j]);
                    s.append(j).append(c[i]);
                    i += j;
                }
            }
            return s.toString();
        }
    }
}
