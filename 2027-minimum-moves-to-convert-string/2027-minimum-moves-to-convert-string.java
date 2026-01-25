class Solution {
    public int minimumMoves(String s) {
        int ind = 0;
        int c = 0;
        while(ind < s.length()){
            if(s.charAt(ind)=='X'){
                c++;
                ind += 3;
            }
            else{
                ind++;
            }
        }
        return c;
    }
}