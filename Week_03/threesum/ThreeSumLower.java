package threesum;

import java.util.*;

public class ThreeSumLower {

    /**
     * 三数之和的暴力解法：
     * 三重遍历
     *
     * Test cases:
     * [-1,0,1,2,-1,-4]
     * [-1,0,1]
     * [0,0,0,0]
     * [-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6]
     */
    class Solution {

        public List<List<Integer>> threeSum(int[] nums) {
            if (nums == null || nums.length < 2) {
                return Collections.EMPTY_LIST;
            }
            Set<List<Integer>> ret = new HashSet<>();
            // 需要先排序，这样最后求的的3个数a b c是有序的
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            ret.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        }
                    }
                }
            }

            return new ArrayList<>(ret);
        }
    }

}
