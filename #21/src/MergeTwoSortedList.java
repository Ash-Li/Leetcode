//Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
public class MergeTwoSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode last = new ListNode(0); last.val = 4; last.next = null;
		ListNode m1 = new ListNode(0); m1.val = 3; m1.next = last;
		ListNode first = new ListNode(0); first.val = 1; first.next = m1;//1,3,4
		ListNode second = new ListNode(0); second.val = 0;second.next = last;//0,4
		Solution a = new Solution();
		
		ListNode fina = new ListNode(0);
		fina = a.mergeTwoLists(first, second);
		System.out.print(fina.val+" "+fina.next.val+" "+fina.next.next.val+" "+fina.next.next.next.val+" ");
	}

}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ListNode {
	 int val;
	 ListNode next;
	 ListNode(int x) { 
		 val = x; 
	 }
}
	 
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	if(l1 == null && l2 == null) return null;
    	if(l1 == null) return l2;
    	if(l2 == null) return l1;
    	
    	
    	ListNode head = null;
    	ListNode temp;
    	temp = head;
    	while(l1 != null && l2 != null) {
    		if(l1.val < l2.val) {
    			if(head == null) {
    				head = l1;
    				temp = head;
    				l1 = l1.next;
    				continue;
    			}
    			
    			temp.next = l1;
				temp = temp.next;
				l1 = l1.next;
        	}
    		else {
    			if(head == null) {
    				head = l2;
    				temp = head;
    				l2 = l2.next;
    				continue;
    			}
          		temp.next = l2;
    			temp = temp.next;
    			l2 = l2.next;
    		}
    	
    	}
    	
    	while(l1 != null) {
    		temp.next = l1;
    		temp = temp.next;
    		l1 = l1.next;
    	}
    	while(l2 != null) {
    		temp.next = l2;
    		temp = temp.next;
    		l2 = l2.next;
    	}
    	return head;
    }
}
