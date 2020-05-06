package twosum;

import java.util.Arrays;

public class TwoSumFasterSort {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] sum = solution.twoSum(new int[]{1, 0, 0, 1}, 1);
    }

    /**
     * 两数之和排序解法
     * 利用排好序的数组，用双指针遍历法
     * 头指针i，尾指针j，若nums[i] + nums[j] == target则找到，
     * 若小于target说明nums[i]太小了，移动头指针，反之移动右指针
     */
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] cp = Arrays.copyOf(nums, nums.length);
            Arrays.sort(cp);
            int i = 0;
            int j = cp.length - 1;
            while (i != j) {
                if (cp[i] + cp[j] == target) {
                    break;
                } else if (cp[i] + cp[j] < target) {
                    i++;
                } else {
                    j--;
                }
            }
            if (i != j) {
                if (cp[i] != cp[j]) {
                    return new int[] {find(nums, 0, nums.length, cp[i]), find(nums, 0, nums.length, cp[j])};
                } else {
                    int x = find(nums, 0, nums.length, cp[i]);
                    int y = find(nums, x + 1, nums.length, cp[j]);
                    return new int[] {x, y};

                }
            }
            return new int[] {-1, -1};
        }

        private int find(int[] nums, int begin, int end, int target) {
            for (int i = begin; i < end; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }
            return -1;
        }
    }
}




