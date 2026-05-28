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
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                if(board[i][j]=='.') continue;
                HashSet<Integer> grid = new HashSet<>();
                int sRow = i/3 * 3;
                int sCol = j/3 * 3;
                for(int k = sRow;k<sRow+3;k++){
                    for(int g = sCol;g<sCol+3;g++){
                        if(board[k][g]=='.') continue;
                        else{
                            if(grid.contains((int)(board[k][g]))) return false;
                            else grid.add((int)(board[k][g]));
                        }
                    }
                }
            }
        }
        return true;
    }
}