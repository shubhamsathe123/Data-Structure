package LinkedList;
class Node
{
	int data;
	Node next;
}
class LinkedList
{
	Node head;
	public void insert(int data)
	{
	  Node node=new Node();
	  node.data=data;
	  node.next=null;
	  //checking head status
	  if(head==null)
	  {
		  head=node;
	  }
	  else
	  {
		  Node n=head;
		  while(n.next!=null)
		  {
			  n=n.next;
		  }
		  n.next=node;
	  }  
	}
	
	//logic to display the node values
	public void display()
	{
		Node n=head;
		while(n.next!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
	}
}
public class LinkedListCreation {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.insert(2);
		l.insert(4);
		l.display();
	}

}
