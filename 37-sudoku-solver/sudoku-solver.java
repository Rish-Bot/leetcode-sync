class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
        
    }

    private boolean solve(char[][] board) {
       
        for(int i = 0; i<board.length; i++) {
            for(int j = 0; j<board[i].length; j++) {
                if(board[i][j] == '.') {
                    for (char digit = '1'; digit<= '9'; digit++) {
                        if (checkCondition(board, i, j, digit)) {
                            board[i][j] = digit;
                        if (solve(board)) {
                            return true;
                        } else {
                            board[i][j] = '.';                        }
                        }
                    }
                    return false;
                }
            }
        }

        return true;
    }

    private boolean checkCondition(char[][] board, int row, int col, int digit) {
        // check rows & columns
        for(int i = 0; i< board.length; i++) {
            if(board[row][i] == digit || board[i][col] == digit) {
                return false;
            }
        }
        //check the matrix 3x3
        int startRow = (row/3)*3;
        int startCol = (col/3)*3;

        for(int i = startRow; i< startRow+3; i++) {
            for(int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == digit) {
                    return false;
                }
            }  
        }

        return true;
    }
}