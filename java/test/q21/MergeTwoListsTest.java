package test.q21;

import code.q21.ListNode;
import code.q21.MergeTwoLists;

/**
 * @author wangshengyi
 */
public class MergeTwoListsTest {
    public static void main(String[] args) {

        ListNode a = new ListNode(1,new ListNode(2, new ListNode(4)));
        ListNode b = new ListNode(1,new ListNode(3, new ListNode(4)));

        MergeTwoLists model = new MergeTwoLists();
        ListNode res = model.mergeTwoListsTest(a, b);

        System.out.println(res);
    }
}
