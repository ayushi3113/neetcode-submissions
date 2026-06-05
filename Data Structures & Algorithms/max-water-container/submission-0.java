class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int i = 0,j = heights.length-1;
        while(i<j){
            int water = (j-i) * Math.min(heights[i],heights[j]);
            area = Math.max(area,water);
            if(heights[i]<heights[j]){
                i++;
            }
            else if(heights[i]>heights[j]){
                j--;
            }
            else{
                i++;
                j--;
            }
        }
        return area;
    }
}
