package poiz.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class T0001 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().twoSum(
                new int[] {3, 3},
                6
        )));
    }

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>(nums.length);
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }

            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target - nums[i])) {
                    int j = map.get(target - nums[i]);
                    if (i == j) continue;
                    if (i > j) {
                        return new int[] {j, i};
                    }
                    return new int[] {i, j};
                }
            }

            return new int[] {};
        }
    }

    static class Solution1 {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (i == j) continue;
                    if (nums[i] + nums[j] == target) {
                        return new int[] {i, j};
                    }
                }
            }
            return new int[0];
        }
    }
}
