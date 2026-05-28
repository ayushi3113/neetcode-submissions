class Solution {
    public boolean isValidSudoku(char[][] board) {
        // We are going to check for row
        for(int i = 0;i<9;i++){
            HashSet<Integer> row = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                else{
                    if(row.contains((int)(board[i][j]))) return false;
                    else row.add((int)(board[i][j]));
                }
            }
        }
        // check for the columns
        for(int i =0;i<9;i++){
            HashSet<Integer> col = new HashSet<>();
            for(int j = 0;j<9;j++){
                if(board[j][i]=='.') continue;
                else{
                    if(col.contains((int)(board[j][i]))) return false;
                    else col.add((int)(board[j][i]));
                }
            }
        }
        // check for 3*3 matrix;
        for(int square=0;square<9;square++){
            HashSet<Integer> grid = new HashSet<>();
            for(int i =0;i<3;i++){
                for(int j =0;j<3;j++){
                    int sRow = square/3 * 3 + i;
                    int sCol = square%3 * 3 + j;
                    if(board[sRow][sCol]=='.') continue;
                    else{
                        if(grid.contains((int)(board[sRow][sCol]))) return false;
                        else grid.add((int)(board[sRow][sCol]));
                    }
                }
            }
        }
        return true;
    }
}