package test.q1021;

import code.q1021.RemoveOuterParentheses;
import code.q1030.AllCellsDistOrder;

import java.util.Arrays;

public class RemoveOuterParenthesesTest {
    public static void main(String[] args) {
        String s = "(()())(())";

        RemoveOuterParentheses model = new RemoveOuterParentheses();

        String res = model.removeOuterParentheses(s);

        System.out.println(res);
    }
}
