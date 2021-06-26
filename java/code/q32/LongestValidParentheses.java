package code.q32;

import java.util.LinkedList;

/**
 * @author wangshengyi
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        LinkedList<Integer> stack = new LinkedList<>();
        int res = 0;

        for(int i = 0; i < s.length(); i++){
            if(stack.isEmpty() || s.charAt(i) == '(' || s.charAt(stack.getLast()) == ')'){
                stack.addLast(i);
            }else{
                stack.removeLast();
                res = Math.max(res, stack.isEmpty() ? i + 1 : i - stack.getLast());
            }
        }
        return res;
    }

}
