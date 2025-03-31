package ds;
public class LinkedListOne {
	static LinkedList linkedList = new LinkedList(0);
	//static int length = 0;

	public static void main(String[] args) {
		for (int i = 1; i <= 12; i++) {
			insertToLastNode(linkedList, i);
		}
		System.out.println();
		displayList(linkedList);

		// insert data into a given position
		int position = 6;
		int data = 11;
		insertToMiddleOfList(linkedList, position, data);

		displayList(linkedList);

		// Delete at given position
		int position1 = 4;
		deleteFromMiddle(linkedList, position1);

		displayList(linkedList);

		// get length of linkedlist
		int length = getLengthOfList(linkedList);

		System.out.println("Length of list is: "+length);

		// Delete a given key
		int key = 5;
		deleteGivenKey(linkedList, key);
		displayList(linkedList);

		//Get nth node from last
		int nthPosition = 4;
		getNthNodeFromEnd(linkedList, nthPosition);
		
		//Get middle node
		getMiddleNode(linkedList);
		
		//Swap two Nodes
		int prevPosition=1;
		int nextposition=7;
		swapTwoNodes(linkedList,prevPosition,nextposition);
		displayList(linkedList);
		
		LinkedList loopList=linkedList;
		createLoopInLinkedlist(loopList);
		
		//Detect if loop exist in list or not
		detectLoopInList(loopList);
		
		//Get length of loop from list
		getLenghtOfLoop(loopList);

	}

	
	private static void insertToLastNode(LinkedList list, int data) {
		LinkedList newList = new LinkedList(data);

		while (list.next != null) {
			list = list.next;
		}
		list.next = newList;

	}

	private static void displayList(LinkedList list) {
		list = list.next;
		while (list != null) {
			System.out.print(list.data + "->");
			list = list.next;
			if (list == null) {
				System.out.println("null");
			}
		}
	}

	private static void insertToMiddleOfList(LinkedList list, int position, int data) {
		LinkedList newList = new LinkedList(data);
		int count = 1;
		while (list != null && count < position) {
			count = count + 1;
			list = list.next;
		}
		if (list != null) {
			newList.next = list.next;
			list.next = newList;
		}

	}

	private static void deleteFromMiddle(LinkedList list, int position) {
		int count = 1;

		while (list != null && count < position) {
			count = count + 1;
			list = list.next;
		}

		LinkedList newList = list.next.next;

		list.next = newList;
	}

	private static int getLengthOfList(LinkedList list) {
		list = list.next;
		int count = 0;
		while (list != null) {
			count = count + 1;
			list = list.next;
		}
		return count;
	}

	private static void deleteGivenKey(LinkedList list, int key) {
		while (list != null) {
			if (list.data != key) {
				if (list.next.data != key) {
					list = list.next;
				} else {
					list.next = list.next.next;
					break;
				}
			} else {
				list.next = list.next.next;
				break;
			}
		}
	}

	private static void getNthNodeFromEnd(LinkedList list, int nthPosition) {

		LinkedList list1 = list;

		boolean flag = false;
		int count = -1;
		while (list != null && count <= nthPosition) {
			count = count + 1;
			list = list.next;

			if (count == nthPosition) {
				count = 1;
				flag = true;
			}

			if (flag) {
				list1 = list1.next;
			}

		}

		System.out.println(nthPosition+"th Node from end is : "+list1.data);

	}
	
	private static void getMiddleNode(LinkedList list) {
		LinkedList list1 = list;
		list=list.next;
		while(list != null) {
			
			if(list.next != null) {
				list=list.next.next;
				list1=list1.next;
			}else {
				list=list.next;
			}
			
		}
		list1=list1.next;
		
		System.out.println("Middle node is : "+list1.data);
		
	}


	private static void createLoopInLinkedlist(LinkedList list) {
		LinkedList newList=list;
		
		newList=newList.next.next.next;
		
		while(list.next != null) {
			list=list.next;
		}
		
		list.next=newList;
	}

	private static void detectLoopInList(LinkedList list) {
		LinkedList newList=list;
		list=list.next;
		
		while(newList.next != list.next) {
			list=list.next.next;
			newList=newList.next;
		}
		
		System.out.println("Loop Exist");
		
	}
	


	private static void getLenghtOfLoop(LinkedList list) {
		LinkedList newList=list;
		list=list.next;
		
		while(newList.next != list.next) {
			list=list.next.next;
			newList=newList.next;
		}
		int count=1;
		list=list.next;
		while(newList.next != list.next) {
			count=count+1;
			list=list.next;
		}
		System.out.println("Length of loop is : "+count);
		
	}
	
	private static void swapTwoNodes(LinkedList list, int position1, int position2) {
		LinkedList prevX=list;
		LinkedList prevY=list;
		LinkedList nextX=list;
		LinkedList nextY=list;
		LinkedList nextZ;
		int countY=0;
		if (!(position1 <= 0 || position2 > getLengthOfList(list))) {
			while (nextY != null) {
				countY=countY+1;
				if(position1 == 1) {
					prevX=list;
					prevY=prevX.next;
				}else if (countY < position1) {
					prevX=prevX.next;
					prevY=prevX.next;
				}
				if (countY < position2) {
					nextX=nextX.next;
					nextY=nextX.next;
				}else {
					nextX.next=prevY;
					prevX.next=nextY;
					nextZ=prevY.next;
					prevY.next=nextY.next;
					nextY.next=nextZ;
					break;
				}
				
			}
		}else {
			System.out.println("Input node is out of range");
		}
		
		
	}


}
