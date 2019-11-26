package poiz.leetcode;

import java.util.Arrays;

public class T0026 {
    public static void main(String[] args) {
        int[] a = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println((new Solution().removeDuplicates(a)));
        System.out.println(Arrays.toString(a));
    }

    static class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums == null || nums.length < 2) return nums.length;
            int i = 1;
            int count = 1;
            while (i < nums.length) {
                if (nums[i] != nums[i - 1]) {
                    nums[count] = nums[i];
                    count++;
                }
                i++;
            }
            return count;
        }
    }
}
