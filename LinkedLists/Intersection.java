package LinkedLists;

public class Intersection {
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        ListNode pa = headA, pb = headB;
	        while (pa != pb) {
	            pa = (pa != null) ? pa.next : headB; // if pa is not null go pa.next else pa becomes the head
	            pb = (pb != null) ? pb.next : headA;
	        }
	        return pa;
	    }
}
