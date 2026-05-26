class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Map<Integer, Set<Character>> rows =  new HashMap<>();
        Map<Integer, Set<Character>> columns = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();
        
        for(int r = 0; r<9; r++){
            for(int c = 0; c<9; c++){

                if(board[r][c]=='.') continue;

                String key = (r/3) + "," + (c/3);
                
                if(rows.computeIfAbsent(r, k -> new HashSet<>()).contains(board[r][c])||
                    columns.computeIfAbsent(c, k -> new HashSet<>()).contains(board[r][c])||
                    squares.computeIfAbsent(key, k -> new HashSet<>()).contains(board[r][c])){
                    return false;
                }

                rows.get(r).add(board[r][c]);
                columns.get(c).add(board[r][c]);
                squares.get(key).add(board[r][c]);

            }
        }

        return true;

    }
}
