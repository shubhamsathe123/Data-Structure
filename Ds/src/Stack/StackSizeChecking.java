package Stack;

class Mystack
{
	int arr[]=new int[4];
	int top=0;
	public void push(int data)
	{
	  if(top==4)
	  {
		  System.out.println("stack is full");
	  }
	  else
	  {
		arr[top]=data;
		top++;
	  }
	}
	public void size()
	{
		System.out.println("size of the stack is"+top);
	}
	public void display()
	{
		top--;
	   for(int i=0;i<arr.length;i++)
	   {
		   System.out.println(arr[i]);
	   }
	}
	public void isEmpty()
	{
		if(top<=0)
		{
			System.out.println("is empty");
		}
		else
		{
			System.out.println("not empty");
		}
	}
	
}
public class StackSizeChecking {
 public static void main(String[] args) {
	Mystack m=new Mystack();
	m.isEmpty();
	m.push(1);
	m.push(2);
	m.push(3);
	m.push(4);
	m.push(5);
	m.size();
	m.isEmpty();
    m.display();	
   
//    m.isEmpty();
 }
}
