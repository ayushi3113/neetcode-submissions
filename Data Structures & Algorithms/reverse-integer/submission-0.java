class Solution {
    public int reverse(int x) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int sum=0;
        while(x!=0){
            int digit = x%10;
            x = x/10;
            if(sum>max/10 || (sum==max/10) && digit>=8 ) return 0;
            if(sum<min/10 || (sum==min/10) && digit>8 ) return 0;
            sum = sum*10 + digit;
        }
        return sum;
    }
}