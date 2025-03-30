class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        int k=0;
        int lastVisit = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                if(k==1){
                    lastVisit = i;
                }
                else{
                     res[k]=i;
                    k++;
                }
               
            }
        }
        if(lastVisit!=0){
            res[k] = lastVisit;
            k++;
        } 
        if(k==1) res[k] = res[k-1];
        return res;
    }
}