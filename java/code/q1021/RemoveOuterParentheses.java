package code.q1021;


/**
 * Tag Stack
 */
public class RemoveOuterParentheses {
    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int level = 0;
        for (char c:S.toCharArray()){
            if(c == ')') level--;
            if(level > 0) sb.append(c);
            if(c == '(') level++;
        }
        return sb.toString();
    }
}
