package Queue;

 class ArrayImplementationOfQ {
	int front, rear,size,capcity;
	int arry[];
	
	public ArrayImplementationOfQ(int capacity)
	{
		this.capcity=capacity;
		front=this.size=0;
		rear=capcity-1;
		arry=new int[this.capcity];
	}
	
	boolean isFull(ArrayImplementationOfQ queue)
	{
		return (queue.size== queue.capcity);
	}
	
	boolean isEmpty(ArrayImplementationOfQ queue)
	{
		return queue.size==0;
		
	}
	
	void enqueue(int item)
	{
		if(isFull(this))
			return;
		
		this.rear=(this.rear+1)%this.capcity;
		this.arry[this.rear]=item;
		this.size=this.size+1;

		
		
	}
	
	int deQueue()
	{
		if(isEmpty(this))
			return Integer.MIN_VALUE;
		
		int item=this.arry[this.front];
		this.front=(this.front+1)%this.capcity;
		this.size=this.size-1;
		return item;
					
	}
	
	int front()
	{
		if(isEmpty(this))
			return 0;
		return this.arry[this.front];
	}
	
	int rear()
	{
		if(isEmpty(this))
			return 0;
		
		return this.arry[this.rear];
	}

}


