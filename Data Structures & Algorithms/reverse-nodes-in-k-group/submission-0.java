class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        ListNode oldHead = head;
        ListNode newHead = reverse(head,k);
        if(newHead==oldHead) return head;
        while(true){
            ListNode start = oldHead.next;
            ListNode newHead1 = reverse(start,k);
            if(start==newHead1) break;
            oldHead.next = newHead1;
            oldHead = start;
        }
        return newHead;
    }
    public ListNode reverse(ListNode temp,int k){
        ListNode temp1 = temp;
        while(temp1!=null && k>0){
            temp1 = temp1.next;
            k--;
        }
        if(k>0) return temp;
        ListNode prev = null,curr=temp,next=null;
        while(curr!=temp1){
            next = curr.next;
            if(curr!=null)curr.next = prev;
            prev = curr;
            curr = next;
        }
        temp.next = temp1;
        return prev;
    }
}
