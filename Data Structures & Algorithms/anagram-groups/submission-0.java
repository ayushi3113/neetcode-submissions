class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> ans1 = new HashMap<>();
        for(String s:strs){
            int[] freq = new int[26];
            for(char ch : s.toCharArray()){
                freq[ch-'a']++;
            }
            String key = Arrays.toString(freq);
            if(ans1.containsKey(key)){
                ans1.get(key).add(s);
            }
            else{
                List<String> c = new ArrayList<>();
                c.add(s);
                ans1.put(key,c);
            }
        }
        for(String a:ans1.keySet()){
            ans.add(ans1.get(a));
        }
        return ans;
    }
}