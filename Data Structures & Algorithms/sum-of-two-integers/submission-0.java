class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
           int Carry = (a & b)<<1;
           a = a^b;
           b = Carry;
        }
        return a;
    }
}
