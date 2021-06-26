package code.q1047;


import java.util.Stack;

/**
 * Tag Stack
 */
public class RemoveDuplicates {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (stack.isEmpty() || stack.peek() != chars[i]) {
                stack.push(chars[i]);
            } else {
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character c:stack){
            sb.append(c);
        }

        return sb.toString();
    }
}
