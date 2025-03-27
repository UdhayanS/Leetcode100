class Solution {
    public long coloredCells(int n) {
        long count=0;
        long ind = 1;
        for(int i=0; i<n; i++){
            if(i==n-1){
                count += ind;
                ind=ind+2;
            }
            else{
                count += ind*2;
                ind = ind+2;
            }
            
        }
        return count;
    }
}