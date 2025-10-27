class Solution {
    public int numberOfBeams(String[] bank) {
        int isAttack = 0;
        boolean flag = false;
        int count = 0;
        int prev = 1;
        for(int i=0; i<bank.length; i++){
            int currCount = 0;
            for(int j=0; j<bank[i].length(); j++){
                if(bank[i].charAt(j)=='1'){
                    flag = true;
                    currCount++;
                }
            }
            if(flag) isAttack++;
            if(isAttack>=2){
                
                count = count+(prev*currCount);
            }
            flag = false;
            if(currCount>=1) prev = currCount;
        }
        return count;
    }
}