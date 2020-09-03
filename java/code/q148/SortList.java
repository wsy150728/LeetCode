package code.q148;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Tag Sort
 * Tag Linked List
 */
public class SortList {
    // 利用数组排序后对比实现
    public ListNode sortList(ListNode head) {
        ListNode res = new ListNode(1);
        List<Integer> list = new ArrayList<>();
        while (head != null){
            list.add(head.val);
            head = head.next;
        }

        Collections.sort(list);
        for (int x:list){
            res.val = x;
            res = res.next;
        }

        return res;
    }
}
