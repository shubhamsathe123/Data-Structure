package LinkedList;

class Node3
{
	int data;
	Node3 next;
}
class LinkedList3
{
	Node3 head;
	public void insert(int data)
	{
		Node3 node=new Node3();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node3 n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}	
	}
	
	public void insertAtIndex(int index,int value)
	{
		Node3 node=new Node3();
		node.data=value;
		node.next=null;
		Node3 n=head;
		for(int i=0;i<index-1;i++)
		{
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
	}
	public void display()
	{
		Node3 n=head;
		while(n.next!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
	}
}

public class InsertionAtSpecificIndex {
	public static void main(String[] args) {
		LinkedList3 l=new LinkedList3();
		l.insert(1);
		l.insert(2);
		l.insert(3);
		System.out.println("my list is");
		l.display();
		l.insertAtIndex(2,6);
		System.out.println("updated list is");
		l.display();
	}

}
