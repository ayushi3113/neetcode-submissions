class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode pointer = dummy;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                pointer.next = list1;
                list1 = list1.next;
            }
            else{
                pointer.next = list2;
                list2 = list2.next;
            }
            pointer = pointer.next;
        }
        // if anyone list is left
        if(list1!=null) pointer.next= list1;
        else pointer.next = list2;
        return dummy.next;
    }
}