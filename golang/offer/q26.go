package main

import "../base"

/** 重排链表
因为链表不支持下标访问，所以我们无法随机访问链表中任意位置的元素。
因此比较容易想到的一个方法是，我们利用线性表存储该链表，然后利用线性表可以下标访问的特点，直接按顺序访问指定元素，重建该链表即可。
复杂度分析
时间复杂度：O(N),N是链表的节点数
空间复杂度：O(N),N是链表的节点数，主要为线性表的开销
*/
func reorderList1(head *base.ListNode) {
	if head == nil {
		return
	}
	var nodes []*base.ListNode
	for node := head; node != nil; node = node.Next {
		nodes = append(nodes, node)
	}
	i, j := 0, len(nodes)-1
	for i < j {
		nodes[i].Next = nodes[j]
		i++
		if i == j {
			break
		}
		nodes[j].Next = nodes[i]
		j--
	}
	nodes[i].Next = nil
}

func main() {
	nodes := &base.ListNode{
		Val: 1,
		Next: &base.ListNode{
			Val: 2,
			Next: &base.ListNode{
				Val: 3,
				Next: &base.ListNode{
					Val: 4,
					Next: &base.ListNode{
						Val: 5,
					},
				},
			},
		},
	}
	reorderList1(nodes)

	for nodes != nil {
		println(nodes.Val)
		nodes = nodes.Next
	}

}
