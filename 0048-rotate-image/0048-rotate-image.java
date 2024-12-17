class Solution {
    public void rotate(int[][] matrix) {
        
        int[][] copiedMatrix = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                copiedMatrix[i][j] = matrix[i][j];
            }
        }
        int m=matrix.length-1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0 ; j < matrix.length ; j++) {  
                matrix[i][j] = copiedMatrix[m][i];
                m--;
            }
            m=matrix.length-1;
        }
    }
}