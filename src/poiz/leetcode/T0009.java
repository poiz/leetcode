package poiz.leetcode;

public class T0009 {
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(200000012));
    }

    static class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0) return false;
            int[] a = new int[32];
            int n = 0;
            while (x > 0) {
                a[n] = x % 10;
                x /= 10;
                n++;
            }
            int i = 0;
            n--;
            while (i < n) {
                if (a[i] != a[n]) return false;
                i++;
                n--;
            }

            return true;
        }
    }

    static class Solution1 {
        public boolean isPalindrome(int x) {
            if (x < 0) return false;
            String s = String.valueOf(x);
            int i = 0;
            int j = s.length() - 1;
            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) return false;
                i++;
                j--;
            }

            return true;
        }
    }
}
