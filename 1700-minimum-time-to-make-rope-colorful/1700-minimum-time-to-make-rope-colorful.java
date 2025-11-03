class Solution {
    public int minCost(String colors, int[] neededTime) {
        int prevInd = 0;
        char prev = colors.charAt(0);
        int count = 0;
        for(int i=1; i<colors.length(); i++){
            if(prev == colors.charAt(i)){
                int minIndex ;
                if(neededTime[i]>neededTime[prevInd]){
                    minIndex = prevInd;
                    prev = colors.charAt(i);
                    prevInd = i;
                    
                }
                else{
                    minIndex = i;
                }
                System.out.print(colors.charAt(minIndex)+" -> "+i);
                count += neededTime[minIndex];
            }
            else{
                prev = colors.charAt(i);
                prevInd = i;
            }
        }
        return count;
    }
}