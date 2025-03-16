class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> set = new HashSet<>();
        int arr[] = new int[2];
        int count=0;
        int sum = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(!set.add(grid[i][j])){
                    arr[0] = grid[i][j];
                }
                else sum += grid[i][j];
                count++;
            }
        }
        int total = (count*(count+1))/2;
        arr[1] = total-sum;
        return arr;
    }
}