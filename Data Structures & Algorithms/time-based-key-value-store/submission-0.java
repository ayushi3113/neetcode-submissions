class TimeMap {

    static class pair{
        String value;
        int timestamp;
        public pair(String value,int timestamp){
            this.value=value;
            this.timestamp = timestamp;
        }
        public int getTimeStamp(){
            return timestamp;
        }
        public String getValue(){
            return value;
        }
    }
    HashMap<String,List<pair>> st;
    public TimeMap() {
        st = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if(!st.containsKey(key)){
            st.put(key,new ArrayList<>());
        }
        List<pair> x = st.get(key);
        x.add(new pair(value,timestamp));
        st.put(key,x);
    }
    
    public String get(String key, int timestamp) {
        if(!st.containsKey(key)) return "";


        List<pair> x = st.get(key);
        int st = 0,end = x.size()-1;
        String ans = "";
        while(st<=end){
            int mid = st + (end - st)/2;
            pair currentPair = x.get(mid);
            if(currentPair.getTimeStamp()<=timestamp){
                ans = currentPair.getValue();
                st = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
}
