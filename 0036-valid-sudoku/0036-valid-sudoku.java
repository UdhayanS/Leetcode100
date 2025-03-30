class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];
                if (current != '.') {
                    for (int b = 0; b < 9; b++) {
                        if (b != j && board[i][b] == current) {
                            return false;
                        }
                    }
                    for (int a = 0; a < 9; a++) {
                        if (i != a && board[a][j] == current) {
                            return false;
                        }
                    }
                    int start = (i / 3) * 3;
                    int end = (j / 3) * 3;
                    for (int x = start; x < start + 3; x++) {
                        for (int y = end; y < end + 3; y++) {
                            if (i != x && j != y && board[x][y] == current) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}