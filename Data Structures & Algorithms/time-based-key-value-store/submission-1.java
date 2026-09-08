class TimeMap {
    HashMap<String,List<Pair>> st;
    public TimeMap() {
        st = new HashMap<>();
    }
    static class Pair{
        String value;
        int timestamp;
        public Pair(String value,int timestamp){
            this.value=value;
            this.timestamp = timestamp;
        }
        String getValue(){
            return value;
        }
        int getTimestamp(){
            return timestamp;
        }
    }
    public void set(String key, String value, int timestamp) {
        if(!st.containsKey(key)){
            st.put(key,new ArrayList<>());
        }
        st.get(key).add(new Pair(value,timestamp));        
    }
    public String get(String key, int timestamp) {
        if(!st.containsKey(key)) return "";
        List<Pair> x = st.get(key);
        String ans = "";
        int st = 0,end = x.size()-1;
        while(st<=end){
            int mid = st + (end - st)/2;
            if(x.get(mid).getTimestamp()<=timestamp){
                Pair p = x.get(mid);
                ans = p.getValue();
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
}