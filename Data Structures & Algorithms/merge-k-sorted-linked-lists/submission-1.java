/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        PriorityQueue<ListNode> st = new PriorityQueue<>((a,b) -> a.val - b.val);
        for(ListNode x : lists){
            if(x!=null)st.offer(x);
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(!st.isEmpty()){
            ListNode temp = st.poll();
            curr.next = temp;
            curr = curr.next;
            temp = temp.next;
            if(temp!=null) st.offer(temp);
        }
        return dummy.next;
    }
}
