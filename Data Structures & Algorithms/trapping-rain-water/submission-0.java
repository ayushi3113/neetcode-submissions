class Solution {
    public int trap(int[] height) {
        int i = 0,j= height.length-1;
        int leftWall = height[i],rightWall = height[j];
        int sum = 0;
        while(i<j){
            if(leftWall<rightWall){
                i++;
                leftWall = Math.max(leftWall,height[i]);
                sum+=leftWall - height[i];
            }
            else{
                j--;
                rightWall = Math.max(rightWall,height[j]);
                sum+=rightWall - height[j];
            }
        }
        return sum;
    }
}
