package twosum;

public class TwoSumLower {

    /**
     * 两数之和暴力解法
     * 遍历数组中的每一个元素x 判断 target-x是否也在数组中
     * 时间复杂度O（n^2)
     */
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] ret = new int[2];
            for (int i = 0; i < nums.length; i++) {
                int x = nums[i];
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - x) {
                        ret[0] = i;
                        ret[1] = j;
                        return ret;
                    }
                }
            }
            // 从测试用例上看，找不到返回[0,0]
            ret[0] = 0;
            ret[1] = 0;
            return ret;
        }
    }
}


