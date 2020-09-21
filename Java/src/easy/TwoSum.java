package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        /**
         * 1 可以使用双重for循环遍历，时间复杂度O(n^2)
         * 2 一遍哈希表，target-nums[i]表示配对值，如果配对值没在哈希表中，就将nums[i]加入哈希表
         *   当遍历到某个值时，发现它的配对值在哈希表中，那么当前值和配对值就是一对，是人们需要的结果
         *
         *   注：将配对值加入哈希表，那么if条件应该改为判断当前值是否在哈希表中
         *   二者没有本质区别
         *   if (map.containsKey(nums[i])) {return new int[]{map.get(nums[i]), i};}
         *   else {map.put(target-nums[i], i);}
         */
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(target - nums[i])) {
//                //return indexes of nums
//                return new int[]{map.get(target - nums[i]), i};
//            }
//            else {
//                map.put(nums[i], i);
//            }
              if (map.containsKey(nums[i])) {return new int[]{map.get(nums[i]), i};}
              else {map.put(target-nums[i], i);}  //K索引i的配对值-V索引i
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
