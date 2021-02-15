package LinkedList;

class Node5
{
	int data;
	Node5 next;
}
class LinkedList5
{
	Node5 head;
   	public void insert(int data)
   	{
   		Node5 node=new Node5();
   		node.data=data;
   		if(head==null)
   		{
   			head=node;
   		}
   		else
   		{
   			Node5 n=head;
   			while(n.next!=null)
   			{
   				n=n.next;
   			}
   			n.next=node;
   		}
   	}
   	public void display()
   	{
   		Node5 n=head;
   		while(n.next!=null)
   		{
   			System.out.println(n.data);
   			n=n.next;
   		}
   		System.out.println(n.data);
   	}
   	
   	//logic to search the data
   	public void search(int d)
   	{
   		Node5 n=head;
   		while(n.next!=null)
   		{
   			if(n.data==d)
   			{
   				System.out.println("yes present");
   			}
   			n=n.next;
   		}
   		   if(n.data==d)
			{
				System.out.println("yes present");
			}
   		   else
   		   {
   			   System.out.println("not present");
   		   }
   	}
}
public class SearchingFromList {
	public static void main(String[] args) {
	  LinkedList5 l=new LinkedList5();
	  l.insert(1);
	  l.insert(2);
	  l.insert(3);
	  l.insert(4);
      l.display();
      l.search(5);
	}
}
