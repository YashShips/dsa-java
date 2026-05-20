class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(board[i], '.');
        }
        cb(0, board, res, n);
        return res;
    }
    public void cb(int col, char[][] board, List<List<String>> res, int n){
        if(col == n){
            List<String> db = new ArrayList<>();
            for(int i = 0; i < n; i++){
                db.add(new String(board[i]));
            }
            res.add(db);
            return;
        }
        for(int row = 0; row < n; row++){
            if(isSafe(row, col, board, n)){
                board[row][col] = 'Q';
                cb(col + 1, board, res, n);
                board[row][col] = '.';
            }
        }
    }
    public boolean isSafe(int row, int col, char[][] board, int n){
            int c = col;
            while(c >= 0){
                if(board[row][c] == 'Q'){
                    return false;
                }
                c--;
            }
            int r = row;
                c = col;
            
            while(r >= 0 && c >= 0){
                if(board[r][c] == 'Q') return false;
                r--;
                c--;
            }

            r = row;
            c = col;
            
            while(r < n && c >= 0){
                if(board[r][c] == 'Q') return false;
                r++;
                c--;
            }
            return true;
    }
}