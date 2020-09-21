package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        /**
         * 1 可以使用双重for循环遍历，时间复杂度O(n^2)
         * 2 一遍哈希表，将
         */
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                //return indexes of nums
                return new int[]{map.get(target - nums[i]), i};
            }
            else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No solution of two sum problem.");
    }

    public static void main(String[] args) {
        int[] a = {7, 4, 6, 5, 2, 1};
        int target = 3;
        System.out.println("nums:" + Arrays.toString(a));
        System.out.println("target:" + target);
        System.out.println(Arrays.toString(twoSum(a, target)));
        System.out.println("--------");
        target = 14;
        System.out.println("target:" + target);
        System.out.println(Arrays.toString(twoSum(a, target)));
    }
}
