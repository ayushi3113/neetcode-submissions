class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length ==0 || lists.length==1) return null;
        PriorityQueue<ListNode>st = new PriorityQueue<>((a,b)->Integer.compare(a.val,b.val));
        for(ListNode x:lists){
            if(x!=null)st.add(x);
        }
        ListNode dummy = new ListNode(0);
        ListNode x = dummy;
        while(!st.isEmpty()){
            ListNode c = st.poll();
            x.next = c;
            x = x.next;
            if(c.next!=null) st.add(c.next);
        }
        return dummy.next;
    }
}
