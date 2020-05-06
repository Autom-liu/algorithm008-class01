package threesum;

import java.util.*;

public class ThreeSumHash {

    /**
     * 三数之和hash法
     * a + b+ c = 0 => a + b = -c
     * 其中c从数组中遍历，剩下的用两数只和的求法求出a b
     * 第二次循环不需要重头遍历，因为a b c 是可交换的，无论其先后顺序，只要确定a 必定能找到b c
     */
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {

            Set<List<Integer>> ret = new HashSet<>();
            Set<Integer> repeatSet = new HashSet<>(nums.length);

            for (int i = 0; i < nums.length; i++) {
                Set<Integer> existElements = new HashSet<>(nums.length);
                int target = -nums[i];
                if (!repeatSet.contains(nums[i])) {
                    for (int j = i + 1; j < nums.length; j++) {
                        int v = target - nums[j];
                        if (existElements.contains(v)) {
                            List<Integer> list = Arrays.asList(nums[i], v, nums[j]);
                            list.sort(Comparator.naturalOrder());
                            ret.add(list);
                        }
                        existElements.add(nums[j]);
                    }
                }
                repeatSet.add(nums[i]);
            }

            return new ArrayList<>(ret);
        }
    }

}
