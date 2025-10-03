

class Solution {
     public boolean exist(char[][] board, String word){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
           
                if (word.charAt(0) == board[i][j]) {
                    boolean found = WordSearch(board, i, j, word, 0);
                    if (found) {
                      
                        return true;
                    }
                }
            }
        }
        return false;
    }

        private static boolean WordSearch(char[][] board, int row, int col, String word, int index) {
        
        if (index == word.length()) {
            return true;
        }

       
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word.charAt(index)) {
            return false;
        }

        char temp = board[row][col];
        board[row][col] = '*';

      
        int[] dr = {-1, 1, 0, 0};  
        int[] dc = {0, 0, 1, -1};  
        for (int i = 0; i < 4; i++) {
            boolean found = WordSearch(board, row + dr[i], col + dc[i], word, index + 1);
            if (found) {
                return true;
            }
        }

        board[row][col] = temp;
        return false;
    }
}
      