class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        for(int i = 0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='.') continue;
                else{
                    // check for that row
                    HashSet<Integer> r = new HashSet<>();
                    int row1=0;
                    while(row1<col){
                        if(board[i][row1]=='.'){
                            row1++;
                            continue;
                        }
                        if(r.contains((int)(board[i][row1]))) return false;
                        else{
                            r.add((int)(board[i][row1]));
                            row1++;
                        }
                    }
                    // now check for col;
                    HashSet<Integer> c = new HashSet<>();
                    int col1=0;
                    while(col1<row){
                        if(board[col1][j]=='.'){
                            col1++;
                            continue;
                        }
                        if(c.contains((int)(board[col1][j]))) return false;
                        else{
                            c.add((int)(board[col1][j]));
                            col1++;
                        }
                    }
                    // check for 3*3 grid;
                    int r1 = i/3 * 3;
                    int c1 = j/3 * 3;
                    HashSet<Integer> grid = new HashSet<>();
                    for(row1=r1;row1<r1+3;row1++){
                        for(col1=c1;col1<c1+3;col1++){
                            if(board[row1][col1]=='.') continue;
                            if(grid.contains((int)(board[row1][col1]))) return false;
                            else{
                                grid.add((int)(board[row1][col1]));
                            }
                        }
                    }
                }
            }
        }
         return true;
    }
}
