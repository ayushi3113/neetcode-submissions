class Solution {
    public Node copyRandomList(Node head) {
       // first copy the entire linked list without the random pointer
       Node dummy = new Node(0);
       Node head1 = dummy;
       Node temp = head;
       HashMap<Node,Node> st = new HashMap<>();
       while(temp!=null){
            Node x = new Node(temp.val);
            dummy.next = x;
            // add in the hashmap for every node and its random
            st.put(temp,x);
            temp = temp.next;
            dummy = x;
       }
       // Connect the random pointer
       temp = head;
       while(temp!=null){
            st.get(temp).random = st.get(temp.random);
            temp = temp.next;
       }
       return head1.next;
    }
}
