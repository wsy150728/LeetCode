package test.q92;


import code.q92.ListNode;
import code.q92.ReverseBetween;

import java.util.List;

public class ReverseBetweenTest {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ReverseBetween model = new ReverseBetween();
        ListNode res = model.reverseBetween(head, 2, 4);

        System.out.println(res);
    }
}
