package code.q21;

/**
 * @author wangshengyi
 */
public class MergeTwoLists {
    public ListNode mergeTwoListsTest(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }
        ListNode head = new ListNode();
        ListNode res = head;

        while (l1 != null &&  l2 != null){
            if(l1.val <= l2.val){
                res.next = l1;
                l1 = l1.next;
            }else{
                res.next = l2;
                l2 = l2.next;
            }
            res = res.next;
        }

        res.next = l1 == null ? l2 : l1;

        return head.next;
    }
}
