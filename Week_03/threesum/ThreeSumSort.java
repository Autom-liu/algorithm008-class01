package threesum;

import java.lang.reflect.Array;
import java.util.*;

public class ThreeSumSort {

    /**
     * 三数之和：排序 + 双指针法
     * 和之前的逻辑就一样，将三数之和的问题化为两数只和的问题
     * 求两数之和的问题，采用的是排序+双指针的办法
     * 优化1： 由于a + b + c = 0 也就是说必须要有一个是负数，所要确定的目标数-c 一定要是负数即可，这样正数范围内就可以不再遍历
     * 优化2： 通用优化方案：用一个Set去重，避免计算重复的c
     * 优化3： 找到a和b后，针对下个相等的元素直接跳过处理，同时也就不需要使用Set去重再转List
     */
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            if (nums == null || nums.length <= 2) {
                return Collections.emptyList();
            }
            List<List<Integer>> ret = new ArrayList<>();
            Set<Integer> repeatSet = new HashSet<>(nums.length);
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                int target = -nums[i];
                if (target < 0) {
                    break;
                }
                if (!repeatSet.contains(nums[i])) {
                    int begin = i + 1;
                    int end = nums.length - 1;
                    while (begin < end) {
                        int value = nums[begin] + nums[end];
                        if (value == target) {
                            int a = nums[begin++];
                            int b = nums[end--];
                            List<Integer> list = Arrays.asList(nums[i], a, b);
                            ret.add(list);
                        } else if (value < target) {
                            begin++;
                        } else {
                            end--;
                        }
                    }
                }
                repeatSet.add(nums[i]);
            }

            return ret;
        }

    }
}
