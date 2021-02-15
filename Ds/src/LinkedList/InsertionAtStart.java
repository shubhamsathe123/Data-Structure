package LinkedList;

class Node2
{
	int data;
	Node2 next;
}
class LinkedList2
{
	Node2 head;
	public void insert(int data)
	{
		Node2 node=new Node2();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node2 n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}	
	}
	public void insertAtStart(int data)
	{
		Node2 n=new Node2();
		n.data=data;
		n.next=head;
		head=n;
	}
	public void display()
	{
		Node2 n=head;
		while(n.next!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
	}
}

public class InsertionAtStart {
	public static void main(String[] args) {
		LinkedList2 l=new LinkedList2();
		l.insert(1);
		l.insert(2);
		l.insert(3);
		System.out.println("my list is");
		l.display();
		l.insertAtStart(5);
		System.out.println("updated list is");
		l.display();
	}

}
