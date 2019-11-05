package LinkedList.java;
/*Remove duplicate element from sorted Linked List
Given a singly linked list consisting of N nodes. The task is to remove duplicates (nodes
with duplicate values) from the given list (if exists).
Example:
Input:
2
4
2 2 4 5
5
2 2 2 2 2
Output:
2 4 5
2
*/
class RemoveDuplicate{
	Node head;
	static class Node{
		int data; Node next;
		Node(int d)
		{
			data = d; next = null;
		}
	}
	public static Node rd(Node node)
	{
		if(node==null || node.next==null)
		{
			return node;
		}
		if(node.data==node.next.data)
		{
			node.next=node.next.next;
			rd(node);
		}
		else
		{
			rd(node.next);
		}
		return node;
	}
	public static void main(String args[]) {
		RemoveDuplicate a = new RemoveDuplicate();
		a.head = new Node(1);
		Node b = new Node(2);
		Node c = new Node(2);
		Node d = new Node(3);
		Node e = new Node(4);
		Node f = new Node(4); 
		Node g = new Node(5);
		
		a.head.next = b; 
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		Node curr = a.head;
		rd(curr);
		System.out.println("---- AFTER ----");
		while(curr!=null)
		{
			System.out.print(curr.data + " "); curr=curr.next;
		}
	}
}