package test.q206;


import code.q206.ReverseList;
import code.q206.ListNode;

public class ReverseListTest {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ReverseList model = new ReverseList();
        ListNode res = model.reverseList1(head);

        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}
