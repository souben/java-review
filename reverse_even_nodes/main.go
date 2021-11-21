package main

import (
	"fmt"

	ren "github.com/souben/algo/reverse-even-nodes/solution"
)

func main() {

	node0 := &ren.ListNode{Val: 5}
	node1 := &ren.ListNode{Val: 2}
	node2 := &ren.ListNode{Val: 6}
	node3 := &ren.ListNode{Val: 3}
	node4 := &ren.ListNode{Val: 9}
	node5 := &ren.ListNode{Val: 1}
	node6 := &ren.ListNode{Val: 7}
	node7 := &ren.ListNode{Val: 3}
	node8 := &ren.ListNode{Val: 8}
	node9 := &ren.ListNode{Val: 4}

	node0.Next = node1
	node1.Next = node2
	node2.Next = node3
	node3.Next = node4
	node4.Next = node5
	node5.Next = node6
	node6.Next = node7
	node7.Next = node8
	node8.Next = node9

	fmt.Println(ren.ReverseEvenLengthGroups(node0))

}
