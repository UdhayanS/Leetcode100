class Solution {
    public int maximumCount(int[] nums) {
        int pCount=0;
        int nCount=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                nCount++;
            }
            else if(nums[i]>0){
                pCount++;
            }
        }
        return nCount>pCount?nCount:pCount;
    }
}