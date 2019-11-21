package poiz.leetcode;

import java.util.Arrays;

public class T0007 {
    public static void main(String[] args) {
        System.out.println(new Solution().reverse(47412));
    }

    static class Solution {
        public int reverse(int x) {
            int result = 0;
            while (x != 0) {
                if (Integer.MAX_VALUE / 10 < result || Integer.MIN_VALUE / 10 > result) {
                    return 0;
                }
                result *= 10;
                result += x % 10;
                x /= 10;
            }
            return result;
        }
    }
}
