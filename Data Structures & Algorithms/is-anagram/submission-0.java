class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int [] freq = new int[26];
        int i = 0,j=0;
        while(i<s.length() && j<t.length()){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(j)-'a']--;
            i++;
            j++;
        }
        for(int c:freq){
            if(c!=0) return false;
        }
        return true;
    }
}
