package code.q20;

import java.util.Stack;

/**
 * @author wangshengyi
 */
public class IsValid {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String each = String.valueOf(s.charAt(i));

            // 栈为空,且第一个是右边，不匹配直接return false
            if (stack.isEmpty() && (")".equals(each) || "}".equals(each) || "]".equals(each))) {
                return false;
            }

            // 左半边
            if ("[".equals(each) || "(".equals(each) || "{".equals(each)) {
                stack.push(each);
                continue;
            }

            if ("(".equals(stack.peek()) && ")".equals(each)) {
                stack.pop();
                continue;
            }
            if ("[".equals(stack.peek()) && "]".equals(each)) {
                stack.pop();
                continue;
            }
            if ("{".equals(stack.peek()) && "}".equals(each)) {
                stack.pop();
                continue;
            }

            return false;
        }

        return stack.isEmpty();
    }
}
