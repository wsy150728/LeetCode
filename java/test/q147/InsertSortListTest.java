package test.q147;


import code.q147.InsertSortList;
import code.q147.ListNode;

public class InsertSortListTest {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(1);
        listNode.next.next.next = new ListNode(3);

        InsertSortList model = new InsertSortList();
        ListNode res = model.insertSortList2(listNode);

        System.out.println(res);
    }
}
