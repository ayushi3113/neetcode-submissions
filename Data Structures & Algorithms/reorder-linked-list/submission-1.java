class Solution {
    public void reorderList(ListNode head) {
       ListNode mid = getMid(head); 
       ListNode mid1 = mid.next;
       mid.next = null;
       // reverse from mid.next
       ListNode prev = null,next = null,temp1=mid1;
       while(temp1!=null){
            next = temp1.next;
            temp1.next = prev;
            prev = temp1;
            temp1= next;
       }
       // so the head of the reversed linked list is prev
       temp1 = head;
       ListNode temp2 = prev;
       while(temp1!=null && temp2!=null){
            next = temp1.next;
            temp1.next = temp2;
            ListNode next1 = temp2.next;
            temp2.next = next;
            temp1 = next;
            temp2 = next1;
       }
    }
    public ListNode getMid(ListNode head){
        ListNode temp1 = head;
        ListNode temp2 = head;
        while(temp2!=null && temp2.next!=null){
            temp1 = temp1.next;
            temp2 = temp2.next.next;
        }
        return temp1;
    }
}
