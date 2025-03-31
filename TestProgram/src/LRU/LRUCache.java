package LRU;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class LRUCache {
	
	Queue<Message> queue=new LinkedList<>();
	
	Map<String,Message> map=new HashMap<>();
	
 public Message checkMessage()
	{
		if(queue.isEmpty())
			return null;
		else
//			LRU.Message m=queue.peek();
		return null;
		
		
		
	}
 
 public void add(Message m)
 {
	 queue.add(m);
 }
	
	

}
