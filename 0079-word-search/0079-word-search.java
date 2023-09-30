class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0 ; i<board.length ; i++) {
            for(int j=0 ; j<board[0].length ; j++) {
                if(board[i][j]==word.charAt(0) && search(i,j,board,word,0)) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean search(int i,int j,char[][] board, String word,int k) {
        if(k==word.length()) {
            return true;
        }
        if(i<0 || j<0 || i==board.length || j==board[0].length || board[i][j]!=word.charAt(k))
            return false;
        
        char ch=board[i][j];
        board[i][j]='#';
        
        boolean d1=search(i+1,j,board,word,k+1);
        boolean d2=search(i,j+1,board,word,k+1);
        boolean d3=search(i-1,j,board,word,k+1);
        boolean d4=search(i,j-1,board,word,k+1);
        board[i][j]=ch;
        return d1||d2||d3||d4;
    }
}