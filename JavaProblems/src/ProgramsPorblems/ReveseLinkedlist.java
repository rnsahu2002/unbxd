package ProgramsPorblems;

public class ReveseLinkedlist {
	
	Node head;
	
	static class Node
	{
		Node next;
		int value;
		
	Node(int value)
	{
		
		this.value=value;
	}
		
		
	}
	
	void reverse()
	{
		Node curr=head;
		Node prev=null;
		Node next = null;
		
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			
		}
head=prev;
		
	}
	
	public void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.value+" ");
			temp=temp.next;
			
		}
		
	}

	public static void main(String[] args) {
	
		ReveseLinkedlist rvs = new ReveseLinkedlist();
		rvs.head=new Node(2);
		Node n1= new Node(3);
		Node n2= new Node(4);
		Node n3= new Node(5);
		Node n4= new Node(6);
		Node n5= new Node(7);
		Node n6= new Node(8);
		rvs.head.next=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=null;
		rvs.print();
		System.out.println();
		rvs.reverse();
		rvs.print();
		
		
	}

}
