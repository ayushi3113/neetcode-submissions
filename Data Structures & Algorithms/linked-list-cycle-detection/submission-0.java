class Solution {
    public boolean hasCycle(ListNode head) {
        // suppose in a round circle two men are running 
        // if one men has 2x speed then the first,both will cross one time
        if(head==null || head.next==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}
