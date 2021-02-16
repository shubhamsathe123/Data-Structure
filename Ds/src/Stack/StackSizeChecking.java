package Stack;

class Mystack
{
	int arr[]=new int[4];
	int top=0;
	public void push(int data)
	{
		arr[top]=data;
		top++;
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
	
}
public class StackSizeChecking {
 public static void main(String[] args) {
	Mystack m=new Mystack();
	m.push(1);
	m.push(2);
	m.push(3);
	m.push(4);
	m.size();
    m.display();	
   
//    m.isEmpty();
 }
}
