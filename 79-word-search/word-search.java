class Solution {
    public boolean exist(char[][] board, String word) {

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)){
                    if (check(0, i, j, board, word)) {
                        return true;
                    }
                }
            }
        }

        return false;
        
    }

    private boolean check(int index, int i, int j, char[][] board, String word) {
        // I have checked all the conditions
        if (index == word.length()) {
            return true;
        }

        // boundary conditions, char mistmatches
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = ' ';
        boolean ans = check(index+1, i+1, j, board, word) || 
        check(index+1, i-1, j, board, word) ||
        check(index+1, i, j-1, board, word) ||
        check(index+1, i, j+1, board, word);
        board[i][j] = temp;

        return ans;
    }
}