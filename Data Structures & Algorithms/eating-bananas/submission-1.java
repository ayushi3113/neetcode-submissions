class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int st = 1,end = Integer.MIN_VALUE;
        int x = Integer.MIN_VALUE;
        for(int i = 0;i<piles.length;i++){
            end = Math.max(end,piles[i]);
        }
        while(st<=end){
            int mid = st + (end - st)/2;
            if(possible(piles,h,mid)){
                end = mid-1;
                x = mid;
            }
            else st = mid+1;
        }
        return x;
    }
    public boolean possible(int [] piles,int h,int speed){
        int h1=0;
        for(int i =0;i<piles.length;i++){
            h1+= (long)(piles[i] + speed - 1)/speed;
        }
        return h1<=h;
    }
}
