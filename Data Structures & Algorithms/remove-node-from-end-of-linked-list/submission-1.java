class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode c = head;
        while(c!=null){
            count++;
            c = c.next;
        }
        int lastIdx = count-n;
        if(lastIdx==0) return head.next;
        ListNode kNode = head;
        ListNode prev = null;
        for(int i =0;i<lastIdx;i++){
            prev = kNode;
            kNode = kNode.next;
        }
        ListNode next = kNode.next;
        if(prev!=null){
            prev.next = next;
        }
        else return head.next;
        return head;
    }
}
