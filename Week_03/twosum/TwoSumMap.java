package twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumMap {

    /**
     * 两数之和哈希表法
     * 两次遍历的比较简单，就不说了。
     * 一次遍历的优化点在于，不需要把整个数组的值和索引建立映射关系。
     * 到我想要的那个数建立了即可，往后不再需要
     * 因此可以边计算边建立映射关系
     */
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int x = nums[i];
                if (map.containsKey(target - x)) {
                    return new int[]{map.get(target - x), i};
                }
                map.put(x ,i);
            }
            return new int[] {0,0};
        }
    }
}
