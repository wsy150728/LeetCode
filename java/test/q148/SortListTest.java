package test.q148;


import code.q148.ListNode;
import code.q148.SortList;

public class SortListTest {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        listNode.next = new ListNode(2);
        listNode.next.next= new ListNode(1);
        listNode.next.next.next= new ListNode(3);

        SortList model = new SortList();
        ListNode res = model.sortList(listNode);

        System.out.println(res);
    }
}
