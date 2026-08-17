class Solution {
    public void setZeroes(int[][] matrix) {
        // so we will use the first row and column for marking
        boolean firstRow = false;
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    matrix[0][j] = 0;
                    if(i>0){
                        matrix[i][0] = 0;
                    }
                    else firstRow = true;
                }
            }
        }
        // now make the rows zeroes
        // leave the rows and col used for marking
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(matrix[0][0]==0){
            for(int j = 0;j<rows;j++){
                matrix[j][0]=0;
            }
        }
        if(firstRow){
            for(int i =0;i<cols;i++){
                matrix[0][i]=0;
            }
        }
    }
}