package Queue;
class Queues{
	int que[]=new int[4];
	int size=0;
	int front;
	int rear=0;
	public void enqueue(int data)
	{
		que[rear]=data;
		rear++;
		size++;
	}
	public void display()
	{
		System.out.println("queue is");
		for(int i=0;i<size;i++)
		{
			System.out.print(que[i]+" ");
		}
	}
}
public class QueueImpl {
 public static void main(String[] args) {
	System.out.println("Queue Implementation");
	Queues q=new Queues();
	q.enqueue(2);
	q.enqueue(3);
	q.display();
	
}
}
