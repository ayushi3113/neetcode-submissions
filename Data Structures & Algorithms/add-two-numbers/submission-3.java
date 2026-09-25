class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int total = 0;
        int carry= 0;
        while(l1!=null || l2!=null){
            if(l1!=null && l2!=null){
                total = l1.val + l2.val + carry;
            }
            else if(l2!=null){
                total = l2.val + carry;
            }
            else if(l1!=null){
                total = l1.val + carry;
            }
            temp.next = new ListNode(total%10);
            carry = total/10;
            temp = temp.next;
            if(l1!=null)l1 = l1.next;
            if(l2!=null)l2 = l2.next;
        }
        while(carry>0){
            temp.next = new ListNode(carry);
            carry/=10;
            temp = temp.next;
        }
        return dummy.next;
    }
}