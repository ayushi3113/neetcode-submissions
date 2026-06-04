class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        while(n>0){
            curr= curr.next;
            n--;
        }
        ListNode slow = head;
        if(curr==null) return head.next;
        while(curr.next!=null){
            slow = slow.next;
            curr = curr.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
