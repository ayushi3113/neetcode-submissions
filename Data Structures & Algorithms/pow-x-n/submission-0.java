class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            return 1/helper(x,-n);
        }
        else{
            return helper(x,n);
        }
    }
    public double helper(double x,int n){
        if(n==0) return 1;
        if(n==1) return x;
        if(n%2==0){
            return myPow(x*x,n/2);
        }
        return x * myPow(x,n-1);
    }
}
