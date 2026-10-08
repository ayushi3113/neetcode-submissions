class LRUCache {
    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);
    HashMap<Integer,Node> st;
    int x = 0;
    public LRUCache(int capacity) {
        st = new HashMap<>(capacity);
        head.next = tail;
        tail.prev = head;
        x = capacity;
    }
    public int get(int key) {
        if(st.containsKey(key)){
            Node temp = st.get(key);
            //remove that node
            remove(temp);
            // add it in the beginning
            Node c = head.next;
            head.next = temp;
            temp.prev = head;
            temp.next = c;
            c.prev = temp;
            return temp.data;
        }
        return -1;
    }
    public void remove(Node temp){
        if(temp.prev!=null)temp.prev.next = temp.next;
        if(temp.next!=null)temp.next.prev = temp.prev;
    }
    public void put(int key, int value) {
        if(st.containsKey(key)){
            Node temp = st.get(key);
            temp.data = value;
            remove(temp);
            Node c = head.next;
            head.next = temp;
            temp.prev = head;
            temp.next = c;
            c.prev = temp;
        }
        else{
            Node temp = new Node(key,value);
            st.put(key,temp);
            Node c = head.next;
            head.next = temp;
            temp.prev = head;
            temp.next = c;
            c.prev = temp;
            if(st.size()>x){
                // remove the least used or the last node
                Node temp1 = tail.prev;
                st.remove(temp1.key);
                remove(temp1);
            }
        }
    }
}
class Node{
    int data;
    Node prev;
    Node next;
    int key;
    Node(int key,int data){
        this.key = key;
        this.data = data;
    }
}