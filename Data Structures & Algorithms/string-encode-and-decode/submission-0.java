class Solution {
    public String encode(List<String> strs) {
        StringBuilder st = new StringBuilder();
        for(String gg:strs){
            st.append(gg.length()).append('#').append(gg);
        }
        return st.toString();
    }
    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i =0;
        while(i<str.length()){
            int j = i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            i = j+1;
            j = i + length;
            ans.add(str.substring(i,j));
            i = j;
        }
        return ans;
    }
}
