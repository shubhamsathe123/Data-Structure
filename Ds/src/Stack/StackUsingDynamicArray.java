package Stack;

class Dstack
{
	 int capacity=4;
	 int stack[]=new int[capacity];
	 int top=0;
	 public void push(int data)
	 {
		 if(size()==capacity)
		 {
			 expand();
		 }
		 else
		 {
		 stack[top]=data;
		 top++;
		 }
	 }
	 private void expand()
	 {
		 int lenght=size();
		 int newStack[]=new int[capacity*2];
		 System.arraycopy(stack, 0, newStack, 0, lenght);
		 stack=newStack;
		 capacity*=2;
	 }
	 public void display()
	 {
		top--;
		for(int i=0;i<stack.length;i++)
		{
			System.out.println(stack[i]);
		}
	 }
	 public int size()
	 {
		 return top;
	 }
}
public class StackUsingDynamicArray {
 public static void main(String[] args) {
	Dstack d=new Dstack();
	 d.push(1);
	 d.push(2);
	 d.push(3);
	 d.push(4);
	 d.push(5);
	 d.display();
}
}
