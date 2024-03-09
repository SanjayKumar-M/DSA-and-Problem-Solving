class Solution {
    public boolean solve(char[][] board, String word,int i,int j, int m, int n, int currentchar){
        if(currentchar == word.length()) return true;
        if(i<0 || j<0 || i==m || j == n || board[i][j] != word.charAt(currentchar)) return false;
        char ch = board[i][j];
        board[i][j] = ' ';
        boolean op1 = solve(board,word,i+1,j,m,n,currentchar+1);
        boolean op2 = solve(board,word,i-1,j,m,n,currentchar+1);
        boolean op3 = solve(board,word,i,j+1,m,n,currentchar+1);
        boolean op4 = solve(board,word,i,j-1,m,n,currentchar+1);
        board[i][j] = ch;
        return op1 || op2 || op3 || op4;
    }
    public boolean exist(char[][] board, String word) {
          int m = board.length;
        int n = board[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] == word.charAt(0)){
                    if(solve(board,word,i,j,m,n,0)) return true;
                }

            }
        }
        return false;
        
    }
}