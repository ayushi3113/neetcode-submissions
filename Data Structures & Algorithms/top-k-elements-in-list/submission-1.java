class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> st = new HashMap<>();
        for(int num:nums){
            if(st.containsKey(num)){
                st.put(num,st.get(num)+1);
            }
            else{
                st.put(num,1);
            }
        }
        // now we have hashmap format ->  no , its frequency
        ArrayList<Integer>[] ans = new ArrayList[nums.length+1];
        for(int i =0;i<ans.length;i++){
            ans[i] = new ArrayList<>();
        }
        for(int key:st.keySet()){
            ans[st.get(key)].add(key);
        }
        int [] ans1 = new int[k];
        int idx = 0;
        for(int i = ans.length-1;i>0 && idx<k;i--){
            for(int num:ans[i]){
                ans1[idx++] = num;
                if(idx==k){
                    return ans1;
                }
            }
        }
        return ans1;
    }
}
