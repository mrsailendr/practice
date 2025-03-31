import java.util.LinkedList;

public class addIntegers {
	
	
		LinkedListNode head;
		class LinkedListNode
		{
			int data;
			LinkedListNode next;
			public LinkedListNode(int dat)
			{
				this.data=data;
			}
			
		}

		  static LinkedListNode add_integers(
		      LinkedListNode integer1, 
		      LinkedListNode integer2) {
		  
		    LinkedListNode result = null;
		    LinkedListNode last = null;
		    int carry = 0;

		    while (
		        integer1 != null ||
		        integer2 != null ||
		        carry > 0) {
		    
		      int first = (integer1 == null ? 0 : integer1.data);
		      int second = (integer2 == null ? 0 : integer2.data);
		      int sum = first + second + carry;
		      LinkedListNode pNew = new LinkedListNode(sum % 10);
		      carry = sum / 10;
		      if (result == null) {
		        result = pNew;
		      } else {
		        last.next = pNew;
		      }

		      last = pNew;
		      if (integer1 != null) {
		        integer1 = integer1.next;
		      }
		      if (integer2 != null) {
		        integer2 = integer2.next;
		      }
		    }
		    return result;
		  }
		  public static void main(String[] args) {

		    int[] v1 = new int[]{1, 2, 3}; // 321
		    int[] v2 = new int[]{1, 2}; // 21
		  
		    LinkedListNode first = LinkedList.create_linked_list(v1);
		    LinkedListNode second = LinkedList.create_linked_list(v2);

		    // sum should be 321 + 21 = 342 => 2->4->3
		    LinkedListNode result = add_integers(first, second);
		    int[] r = new int[]{2, 4, 3}; // 342
		    LinkedListNode expected = LinkedList.create_linked_list(r);
		    System.out.println(LinkedList.is_equal(result, expected));

		    System.out.printf("\nFirst:");
		    LinkedList.display(first);
		    System.out.printf("\nSecond:");
		    LinkedList.display(second);
		    System.out.printf("\nResult:");
		    LinkedList.display(result);

		    result = add_integers(first, null);
		    System.out.println(LinkedList.is_equal(result, first));

		    result = add_integers(null, second);
		    System.out.println(LinkedList.is_equal(result, second));

		}
		} 

}
