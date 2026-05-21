class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> st = new ArrayList<>();
        HashMap<String,List<String>> ans1 = new HashMap<>();
        for(String s: strs){
            int[] freq = new int[26];
            for(char c:s.toCharArray()){
                freq[c-'a']++;
            }
            String x = Arrays.toString(freq);
            if(ans1.containsKey(x)){
                List<String> ans =ans1.get(x);
                ans.add(s);
                ans1.put(x,ans);
            }
            else{
                List<String> ans = new ArrayList<>();
                ans.add(s);
                ans1.put(x,ans);
            }
        }
        for(String g:ans1.keySet()){
            st.add(ans1.get(g));
        }
        return st;
    }
}
