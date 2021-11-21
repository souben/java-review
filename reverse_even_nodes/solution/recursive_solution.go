package solution

// Definition for singly-linked list.
type ListNode struct {
	Val  int
	Next *ListNode
}

func ReverseEvenLengthGroups(head *ListNode) *ListNode {
	reverseEvenLengthGroupsHelper(head, 1, 2)
	return head
}

func reverseEvenLengthGroupsHelper(node *ListNode, actualI int, group int) {
	if node == nil {
		return
	} else {
		numbOfNodes, nodesValues, tailOfNodes := getInfoOfSubset(node, group)
		if numbOfNodes%2 == 0 && numbOfNodes != 0 {
			newNode, newTail := reverseList(numbOfNodes, nodesValues)
			node.Next = newNode
			if tailOfNodes != nil {
				newTail.Next = tailOfNodes.Next
			}
			reverseEvenLengthGroupsHelper(newTail, actualI+group, group+1)
		} else {
			reverseEvenLengthGroupsHelper(tailOfNodes, actualI+group, group+1)
		}

	}
}

func reverseList(n int, val []int) (*ListNode, *ListNode) {
	if n == 0 {
		return nil, nil
	}
	node := &ListNode{Val: val[n-1]}
	nodeJ := node
	for i := n - 2; i >= 0; i-- {
		nodeI := &ListNode{Val: val[i]}
		nodeJ.Next = nodeI
		nodeJ = nodeJ.Next
	}
	return node, nodeJ
}

func getInfoOfSubset(node *ListNode, k int) (int, []int, *ListNode) {
	i := 0
	listOfValues := []int{}
	for i < k {
		node = node.Next
		if node != nil {
			i++
			listOfValues = append(listOfValues, node.Val)
		} else {
			break
		}
	}
	return i, listOfValues, node
}
