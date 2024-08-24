class Solution {
public boolean isValidSudoku(char[][] board) {
    HashSet<Character>[] rows = new HashSet[9];
    HashSet<Character>[] columns = new HashSet[9];
    HashSet<Character>[] boxes = new HashSet[9];

    for (int i = 0; i < 9; i++) {
        rows[i] = new HashSet<>();
        columns[i] = new HashSet<>();
        boxes[i] = new HashSet<>();
    }

    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            char current = board[i][j];
            if (current != '.') {
                // Check row
                if (rows[i].contains(current)) {
                    return false;
                }
                rows[i].add(current);

                // Check column
                if (columns[j].contains(current)) {
                    return false;
                    }
                columns[j].add(current);
                // Check 3x3 box
                int boxIndex = (i / 3) * 3 + j / 3;
                if (boxes[boxIndex].contains(current)) {
                        return false;
                }
                boxes[boxIndex].add(current);
            }
        }
    }

    return true;
}
}



