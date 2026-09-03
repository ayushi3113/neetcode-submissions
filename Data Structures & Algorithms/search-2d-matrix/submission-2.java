class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int col = matrix[0].length;
        int st = 0,end = (rows * col) - 1;
        while(st<=end){
            int mid = st + (end - st)/2;
            if(matrix[mid/col][mid % col]==target) return true;
            else if(matrix[mid/col][mid % col]>target) end--;
            else st++;
        }
        return false;
    }
}
