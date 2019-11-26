package poiz.leetcode;

import java.util.Arrays;

public class T0066 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{9,9,9,9})));
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{9,9,9,8})));
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{0})));
    }

    static class Solution {
        public int[] plusOne(int[] digits) {
            if (digits == null || digits.length == 0) return new int[0];
            int i = digits.length - 1;
            digits[i] += 1;
            while (i > 0) {
                if (digits[i] < 10) break;
                digits[i - 1] += 1;
                digits[i] %= 10;
                i--;
            }
            if (digits[0] > 9) {
                int[] r = new int[digits.length + 1];
                r[0] = 1;
                System.arraycopy(digits, 0, r, 1, digits.length);
                r[1] %= 10;
                return r;
            }
            return digits;
        }
    }
}
