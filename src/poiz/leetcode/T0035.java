package poiz.leetcode;

import java.util.Arrays;

public class T0035 {
    public static void main(String[] args) {
        System.out.println((new Solution().searchInsert(new int[]{1,3,5,6},5)));
        System.out.println((new Solution().searchInsert(new int[]{1,3,5,6},2)));
        System.out.println((new Solution().searchInsert(new int[]{1,3,5,6},7)));
        System.out.println((new Solution().searchInsert(new int[]{1,3,5,6},0)));
    }

    static class Solution {
        public int searchInsert(int[] nums, int target) {
            if (nums == null || nums.length < 1) return 0;
            int i = 0;
            while (i < nums.length) {
                if (nums[i] == target || nums[i] > target) return i;
                i++;
            }
            return i;
        }
    }
}
