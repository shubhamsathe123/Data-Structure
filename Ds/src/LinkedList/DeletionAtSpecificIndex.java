package LinkedList;

class Node4
{
	int data;
	Node4 next;
}
class LinkedList4
{
	Node4 head;
	public void insert(int data)
	{
		Node4 node=new Node4();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node4 n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}	
	}
	
	public void deletionAtIndex(int index)
	{
		Node4 n1=null;
		Node4 n=head;
		for(int i=0;i<index-1;i++)
		{
			n=n.next;
		}
		n1=n.next;
		n.next=n1.next;
		n1=null;
	}
	
	public void display()
	{
		Node4 n=head;
		while(n.next!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
	}
}

public class DeletionAtSpecificIndex {
	public static void main(String[] args) {
		LinkedList4 l=new LinkedList4();
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.display();
		l.deletionAtIndex(2);
		System.out.println("updated list is");
		l.display();
	}

}
