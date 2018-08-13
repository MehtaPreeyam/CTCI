package LinkedLists;

public class isPalindrome {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	class Solution {
	public boolean isPalindrome(ListNode head) {
	 
	    if(head == null || head.next==null)
	        return true;
	 
	    //find list center
	    ListNode fast = head;
	    ListNode slow = head;
	 
	    while(fast.next!=null && fast.next.next!=null){
	        fast = fast.next.next;
	        slow = slow.next;
	    }
	 
	    ListNode secondHead = slow.next; //Need to go one in front of center for reversing
	    slow.next = null;
	 
	    //reverse second part of the list
	    ListNode p1 = secondHead; //becomes prev
	    ListNode p2 = p1.next; // becomes next
	 
	    while(p1!=null && p2!=null){
	        ListNode temp = p2.next;
	        p2.next = p1;
	        p1 = p2;
	        p2 = temp;
	    }
	 
	    secondHead.next = null; // splits the list in half
	 
	    //compare two sublists now
	    ListNode p = (p2==null?p1:p2); // if p2 is null p=p1 else it becomes p2
	    ListNode q = head;
	    while(p!=null){
	        if(p.val != q.val)
	            return false;
	 
	        p = p.next;
	        q = q.next;
	 
	    }
	 
	    return true;
	}
	}
}
