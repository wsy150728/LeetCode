package code.q206;

/**
 * 反转链表
 *
 * @author admin
 */
public class ReverseList {

    // 迭代
    public ListNode reverseList(ListNode head) {
        // 顶一个一个空链表
        ListNode prev = null;
        // 定义一个指向head头的curr指针
        ListNode curr = head;
        while (curr != null) {
            // 记录curr.next
            ListNode next = curr.next;

            //反指
            curr.next = prev;

            // 移动prev和curr
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // 递归
    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList1(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

}
