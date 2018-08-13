package LinkedLists;

public class LoopDetection {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        //find meeting point. this will be (loop_size-k) steps into the loop
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){//collision
                break;
            }
        }
        //error check-no meeting point, it means no loop
        if(fast == null || fast.next == null){
            return null;
        }
        //move slowPointer to head. keep fastPointer at the meeting point. each are k steps from the loop start. 
        //if they move at the same pace, they must meet at the loop start
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        //both points now at the start of loop, return either is ok
        return fast;
    }

}
