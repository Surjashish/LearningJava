package Codility;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
                continue;
            }
            if (c == ']') {
                if (stack.size() == 0)
                    return false;
                if (stack.peek() == '[')
                    stack.pop();
                else {
                    return false;

                }
            }
            if (c == '}') {
                if (stack.size() == 0)
                    return false;
                if (stack.peek() == '{')
                    stack.pop();
                else {
                    return false;
                }
            }
            if (c == ')') {
                if (stack.size() == 0)
                    return false;
                if (stack.peek() == '(')
                    stack.pop();
                else {
                    return false;
                }
            }
        }
        return stack.size() == 0;

    }
}
