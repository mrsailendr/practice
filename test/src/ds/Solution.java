package ds;

import java.util.Arrays;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = null,curr=null;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                curr = add(curr,list1);
                list1 = list1.next;
            }else{
                curr = add(curr,list2);
                list2 = list2.next;
            }
            if(result==null) result=curr;
        }
        curr.next = list1==null?list2:list1;
        return result;
    }

    public ListNode add(ListNode head, ListNode list){
        if(head!=null) head.next=list;
        head = list;
        return head;
    }

    public static void main(String[] args) {
        // Create the first sorted linked list: 1 -> 3 -> 5
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        // Create the second sorted linked list: 2 -> 4 -> 6
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        // Merge the two lists
        Solution solution = new Solution();
        ListNode mergedList = solution.mergeTwoLists(l1, l2);

        // Print the merged list
        printList(mergedList); // Expected output: 1 -> 2 -> 3 -> 4 -> 5 -> 6
    }
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
