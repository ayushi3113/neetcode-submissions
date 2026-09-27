class Solution {
    public Node copyRandomList(Node head) {
        Node dummy = new Node(Integer.MAX_VALUE);
        Node temp = dummy;
        // we need to store the random pointer nodes
        Node temp1 = head;
        HashMap<Node,Node> st = new HashMap<>();
        while(temp1!=null){
            Node x = new Node(temp1.val);
            temp.next = x;
            temp = x;
            st.put(temp1,x);
            temp1 = temp1.next;
        }
        temp1 = head;
        while(temp1!=null){
            st.get(temp1).random = st.get(temp1.random);
            temp1 = temp1.next;
        }
        return dummy.next;
    }
}
