package poiz.leetcode;

import java.util.Arrays;

public class T0027 {
    public static void main(String[] args) {
        int[] a = new int[]{2};
        System.out.println((new Solution().removeElement(a,2)));
        System.out.println(Arrays.toString(a));
    }

    static class Solution {
        public int removeElement(int[] nums, int val) {
            if (nums == null || nums.length < 1) return 0;
            int i = 0;
            int count = 0;
            while (i < nums.length) {
                if (nums[i] != val) {
                    nums[count] = nums[i];
                    count++;
                }
                i++;
            }
            return count;
        }
    }
}
