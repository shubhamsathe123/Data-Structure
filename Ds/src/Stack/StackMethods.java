package Stack;

class Stack
{
	int arr[]=new int[5];
	int top=0;
  public void push(int data)
  {
	  arr[top]=data;
	  top++;
  }
  public void pop()
  {
	  top--;
	  arr[top]=0;  
  }
  public void display()
  {
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.println(arr[i]);
	  }
  }
}
public class StackMethods {
 public static void main(String[] args) {
	Stack s=new Stack();
	s.push(1);
	s.push(2);
	s.push(3);
	s.push(4);
	s.push(5);
	s.display();
	s.pop();
	s.display();
 }
}
