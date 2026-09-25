class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry= 0;
        while(l1!=null || l2!=null || carry>0){
            int v1 = l1==null ? 0 : l1.val;
            int v2 = l2==null ? 0 : l2.val;
            int total = v1 + v2 + carry; 
            temp.next = new ListNode(total%10);
            carry = total/10;
            temp = temp.next;
            if(l1!=null)l1 = l1.next;
            if(l2!=null)l2 = l2.next;
        }
        return dummy.next;
    }
}