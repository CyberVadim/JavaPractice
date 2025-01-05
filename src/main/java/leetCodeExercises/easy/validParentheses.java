package leetCodeExercises.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
Given a string s containing just
the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true
 */
public class validParentheses {
    public static void main(String[] args) {
        String case1 = "()"; // true
        String case2 = "()[]{}"; // true
        String case3 = "(]"; // false
        String case4 = "([])"; // true

        System.out.println(isValid(case1));
        System.out.println(isValid(case2));
        System.out.println(isValid(case3));
        System.out.println(isValid(case4));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put(']', '[');
        bracketMap.put('}', '{');

        for(char c : s.toCharArray()) {
            if(bracketMap.containsValue(c)) {
                stack.push(c);
            } else if (bracketMap.containsKey(c)) {
                if (stack.empty() || bracketMap.get(c) != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
