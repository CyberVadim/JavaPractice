package leetCodeExercises.easy;
/*
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


Constraints:

-231 <= x <= 231 - 1


Follow up: Could you solve it without converting the integer to a string?

*/
public class palindromeNumber {
    public static void main(String[] args) {
        int case1 = 121; // true
        int case2 = -121; // false
        int case3 = 10; // false
        System.out.println(isPalindrome(case1));
        System.out.println(isPalindrome(case2));
        System.out.println(isPalindrome(case3));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        String numberStr = Integer.toString(x);
        String reverse = new StringBuilder(numberStr).reverse().toString();
        int result = Integer.parseInt(reverse);
        if (x == result) {
            return true;
        } else {
            return false;
        }
    }

}
