package leetCodeExercises.easy;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 */
public class twoSum {
    public static void main(String[] args) {
        int[] case1 = {2,7,11,15};
        int target1 = 9;

        int[] case2 = {3,2,4};
        int target2 = 6;

        int[] case3 = {3,3};
        int target3 = 6;

        int[] result1 = twoSum(case1, target1);
        int[] result2 = twoSum(case2, target2);
        int[] result3 = twoSum(case3, target3);

        System.out.println(result1[0] + " " + result2[0]);
        System.out.println(result2[0] + " " + result3[0]);
        System.out.println(result3[0] + " " + result1[0]);
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("Не найдено решения");
    }
}
