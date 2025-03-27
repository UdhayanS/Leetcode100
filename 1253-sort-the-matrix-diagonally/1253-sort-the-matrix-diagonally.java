import java.util.*;

class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        if (m == 1) return mat; // Edge case: If only one row, return as is.

        // Sorting diagonals starting from the first column
        for (int k = 0; k < m; k++) {
            int i = k;
            List<Integer> list = new ArrayList<>();
            
            for (int j = 0; j < Math.min(n, m - k); j++) { // Fixing diagonal traversal range
                list.add(mat[i][j]);
                i++;
            }
            
            Collections.sort(list);
            i = k;
            
            for (int j = 0; j < Math.min(n, m - k); j++) {
                mat[i][j] = list.get(j);
                i++;
            }
        }

        // Sorting diagonals starting from the first row
        for (int k = 1; k < n; k++) {
            int i = 0;
            List<Integer> list = new ArrayList<>();
            
            for (int j = k; j < n && i < m; j++) { // Fixing diagonal traversal range
                list.add(mat[i][j]);
                i++;
            }
            
            Collections.sort(list);
            i = 0;
            int ind = 0;
            
            for (int j = k; j < n && i < m; j++) {
                mat[i][j] = list.get(ind++);
                i++;
            }
        }
        
        return mat;
    }
}
