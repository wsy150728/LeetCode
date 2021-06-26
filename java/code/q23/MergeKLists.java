package code.q23;


/**
 * @author wangshengyi
 */
public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0);
        ListNode res = head;
        while (true){
            ListNode minNode = null;
            int k = -1;
            // 循环链表找到最小值
            for(int i = 0; i < lists.length; i++){
                if (lists[i] == null) {
                    continue;
                }
                if(minNode == null || minNode.val > lists[i].val){
                    minNode = lists[i];
                    k = i;
                }
            }

            // 循环完了这次没找到最小值
            if(k == -1){
                break;
            }

            // 找到最小值赋值
            res.next = minNode;
            res = res.next;

            // 最小的链表指向下一个
            lists[k] = lists[k].next;
        }
        return head.next;

    }
}
