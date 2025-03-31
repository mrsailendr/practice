package Queue;

public class LinkedListImplementsQ {
	
	QNode rear,front;
	public LinkedListImplementsQ()
	{
		this.rear=this.front=null;
	}
	
	void enQueue(int key)
	{
		QNode new_node=new QNode(key);
		if(this.rear==null)
		{
			this.front=this.rear=new_node;
			return;
		}
		
		this.rear.next=new_node;
		this.rear=new_node;
		
	}
	
	QNode deQueue()
	{
		if(this.front==null)
			return null;
		QNode item=this.front;
		this.front=this.front.next;
		
		if(this.front==null)
			this.rear=null;
		
		return item;
	}
	
	public static void main(String[] arg)
	{
		LinkedListImplementsQ lq=new LinkedListImplementsQ();
		lq.enQueue(11);
		lq.enQueue(13);
		lq.enQueue(14);
		lq.enQueue(15);
		lq.enQueue(16);
		
		
		System.out.println(lq.deQueue().key);
	}

}
