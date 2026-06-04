class Solution {
    public void reorderList(ListNode head) {
        if(head.next==null) return;
        ListNode mid = getMid(head);
        ListNode midNext = mid.next;
        ListNode midPrev = null;
        mid.next=null;
        while(midNext!=null){
            ListNode next = midNext.next;
            midNext.next = midPrev;
            midPrev = midNext;
            midNext = next;
            if(next!=null) next = next.next;
        }
        ListNode curr = head;
        while(curr!=null && midPrev!=null){
            ListNode next1 = curr.next;
            ListNode next2 = midPrev.next;
            curr.next = midPrev;
            midPrev.next = next1;
            curr = next1;
            midPrev  = next2;
        }
    }
    public ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
