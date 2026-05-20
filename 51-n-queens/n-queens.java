class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char board[][] = new char[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(board[i], '.');
        }
        cb(0, board, res, n);
        return res;
    }
    public void cb(int col, char[][] board, List<List<String>> res, int n){
        if(col == n){
            List<String> ds = new ArrayList<>();
            for(int i = 0; i < n; i++){
                ds.add(new String(board[i]));
            }
            res.add(ds);
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
        int c = col,
            r = row;
        
        while(c >= 0){
            if(board[row][c] == 'Q') return false;
            c--;
        }

        c = col;

        while(c >= 0 && r >= 0){
            if(board[r][c] == 'Q') return false;
            c--;
            r--;
        }

        c = col;
        r = row;

        while(c >= 0 && n > r){
            if(board[r][c] == 'Q') return false;
            c--;
            r++;
        }
        return true;
    }
}