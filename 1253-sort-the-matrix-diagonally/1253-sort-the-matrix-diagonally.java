class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        if(mat.length == 1) return mat;
        for(int k=0; k<m; k++){
            int i=k;
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<Math.min(n, m-k); j++){
                list.add(mat[i][j]);
                //System.out.println(i+" "+j);
                i++;
            }
            Collections.sort(list);
            //System.out.println(list);
            i=k;
            for(int j=0; j<Math.min(n, m-k); j++){
                mat[i][j] = list.get(j);
                i++;
            }
        }

        for(int k=1; k<n; k++){
            int i=0;
            List<Integer> list = new ArrayList<>();
            for(int j=k; j<n && i<m; j++){
                list.add(mat[i][j]);
                i++;
            }
            Collections.sort(list);
            i=0;
            int ind=0;
            for(int j=k; j<n && i<m; j++){
                mat[i][j] = list.get(ind++);
                i++;
            }
        }
        return mat;
    }
}