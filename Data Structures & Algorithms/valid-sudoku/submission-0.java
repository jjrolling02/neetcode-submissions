class Solution {
    public boolean isValidSudoku(char[][] board) {
                HashMap <Integer, HashSet<Character>> row = new HashMap<>();
        HashMap <Integer, HashSet<Character>> col = new HashMap<>();
        HashMap <Integer, HashSet<Character>> box = new HashMap<>();

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] == '.')
                    continue;

                int boxNum = (i/3)*3 + (j/3);
                //check if row/col/box exists
                if(!row.containsKey(i))
                    row.put(i, new HashSet<>());
                if(!col.containsKey(j))
                    col.put(j, new HashSet<>());
                if(!box.containsKey(boxNum))
                    box.put(boxNum, new HashSet<>());
                
                //add to hashset row/col and check if it exists already
                if(!row.get(i).add(board[i][j]))
                    return false;
                if(!col.get(j).add(board[i][j]))
                    return false;
                if(!box.get(boxNum).add(board[i][j]))
                    return false;
            }

        }
        return true;
    }
}
