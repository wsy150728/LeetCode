package test.q22;

import code.q21.ListNode;
import code.q21.MergeTwoLists;
import code.q22.GenerateParenthesis;
import code.q59.GenerateMatrix;

import java.util.List;

/**
 * @author wangshengyi
 */
public class GenerateParaenthesisTest {
    public static void main(String[] args) {

        int n = 3;

        GenerateParenthesis model = new GenerateParenthesis();
        List<String> res = model.generateParenthesis(n);

        System.out.println(res);
    }
}
