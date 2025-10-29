class Solution {
    public int smallestNumber(int n) {
        int sum = 0;
        int prev = 1;
        while(true){
            if(sum>=n){
                break;
            }
            else{
                sum += prev;
                prev = prev*2;
            }
        }
        //System.out.print(sum);
        return sum;
    }
}