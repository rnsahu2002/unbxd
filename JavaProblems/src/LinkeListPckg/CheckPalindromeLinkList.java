package LinkeListPckg;

import java.util.Stack;

public class CheckPalindromeLinkList {
	Node head;

	static class Node {
		Integer data;
		Node next;

		Node(int value) {
			data = value;
			next = null;
		}

	}

	public void checkPalinddrom() {
		boolean ispalindrome = true;
		Node node = head;
		Node node1 = head;

		Stack<Integer> stk = new Stack<Integer>();
		while (node != null) {
			stk.push(node.data);
			node = node.next;
		}

		while (node1 != null) {
			if (!node1.data.equals(stk.pop())) {
				// System.out.println("Not pali");
				ispalindrome = false;
				break;
			}
			node1 = node1.next;
		}
		System.out.println(ispalindrome);
	}

	
		Node reverse(Node node) 
		{

while(node!=null)
{
			Node current = node;
			Node prev = null;
	        Node next = null;
	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        node = prev;
}
	return node;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.data);
			temp = temp.next;
		}

	}

	public static void main(String[] args) {

		CheckPalindromeLinkList list = new CheckPalindromeLinkList();
		list.head = new Node(10);
		Node obj1 = new Node(11);
		Node obj2 = new Node(12);
		Node obj3 = new Node(13);
		Node obj4 = new Node(12);
		Node obj5 = new Node(11);
		Node obj6 = new Node(10);
		list.head.next = obj1;
		obj1.next = obj2;
		obj2.next = obj3;
		obj3.next = obj4;
		obj4.next = obj5;
		obj5.next = obj6;
		obj6.next = null;
		list.printList();
		list.checkPalinddrom();
	}

}
