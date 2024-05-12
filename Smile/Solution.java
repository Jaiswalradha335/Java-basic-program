class Solution {
    public boolean isSafe(char[][] board, int row, int col, int number) {
        // Check row & column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) {
                return false;
            }
            if (board[row][i] == (char) (number + '0')) {
                return false;
            }
        }
        // Check grid
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true; // Base case: solution found
        }
        int nextRow = 0;
        int nextCol = 0;
        if (col != board.length - 1) {
            nextRow = row;
            nextCol = col + 1;
        } else {
            nextRow = row + 1;
            nextCol = 0;
        }
        if (board[row][col] != '.') {
            // If the current cell is not empty, move to the next cell
            return helper(board, nextRow, nextCol);
        } else {
            // Try to place numbers from 1 to 9 in the current cell
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    // If it's safe to place the number, place it and move to the next cell
                    board[row][col] = (char) (i + '0');
                    if (helper(board, nextRow, nextCol)) {
                        return true; // If a solution is found, return true
                    } else {
                        board[row][col] = '.'; // Backtrack
                    }
                }
            }
        }
        return false; // No solution found
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0); // Start solving from the top-left cell
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] sudokuBoard = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        solution.solveSudoku(sudokuBoard);
        System.out.println("Solved Sudoku:");
        for (char[] row : sudokuBoard) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
