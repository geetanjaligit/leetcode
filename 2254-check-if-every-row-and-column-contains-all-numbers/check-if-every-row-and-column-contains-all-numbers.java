import java.util.HashSet;

class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        HashSet<Integer> set = new HashSet<>();

        // Check each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                set.add(matrix[i][j]);
            }
            if (set.size() != n) {
                return false;
            }
            set.clear();
        }

        // Check each column
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                set.add(matrix[i][j]);
            }
            if (set.size() != n) {
                return false;
            }
            set.clear();
        }

        return true;
    }
}
