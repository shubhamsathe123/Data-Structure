package Queue;
class Queues{
	int que[]=new int[4];
	int size=0;
	int front=0;
	int rear=0;
	public void enqueue(int data)
	{
		que[rear]=data;
		//rear++
	    rear=(rear+1)%4;
		size++;
	}
	public void dequeue()
	{
		//front++
      front=(front+1)%4;
      size--;
	}
	public void display()
	{
		System.out.println("queue is");
		for(int i=0;i<size;i++)
		{
			System.out.print(que[(front+i)%4]+" ");
		}
		System.out.println("original array is");
		for(int i=0;i<que.length;i++)
		{
			System.out.print(que[i]);
		}
	}
}
public class QueueImpl {
 public static void main(String[] args) {
	System.out.println("Queue Implementation");
	Queues q=new Queues();
	q.enqueue(2);
	q.enqueue(3);
	q.enqueue(4);
	q.enqueue(6);
//	q.display();
	q.dequeue();
	q.display();
	
}
}
