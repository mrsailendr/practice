package Queue;

public class TestQueue {

		public static void main(String[] arg)
		{
			ArrayImplementationOfQ queue=new ArrayImplementationOfQ(100);
			queue.enqueue(12);
			queue.enqueue(1132);
			queue.enqueue(132);
			queue.enqueue(1322);
			queue.enqueue(142);
			queue.enqueue(162);
			
			System.out.println(queue.deQueue());
		}
	

}
