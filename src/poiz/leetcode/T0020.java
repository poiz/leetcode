package poiz.leetcode;

import java.util.Stack;

public class T0020 {
    public static void main(String[] args) {
        System.out.println(new Solution().isValid("()[]{}"));
    }

    static class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                switch (c) {
                    case '(':
                    case '{':
                    case '[':
                        stack.push(c);
                        break;
                    case ')':
                        if (stack.empty() || stack.pop() != '(') return false;
                        break;
                    case '}':
                        if (stack.empty() || stack.pop() != '{') return false;
                        break;
                    case ']':
                        if (stack.empty() || stack.pop() != '[') return false;
                        break;
                }
            }
            return stack.empty();
        }
    }
}
