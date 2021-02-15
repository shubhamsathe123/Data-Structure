package LinkedList;

import java.util.Scanner;

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
		System.out.println("my list is");
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
		//l.insert(2);
		//l.insert(4);
		Scanner s=new Scanner(System.in);
		System.out.println("how many values you want to insert");
		int no=s.nextInt();
		System.out.println("enter the values");
		for(int i=0;i<no;i++)
		{
			int value=s.nextInt();
		     l.insert(value);
		}
		l.display();
	}

}
