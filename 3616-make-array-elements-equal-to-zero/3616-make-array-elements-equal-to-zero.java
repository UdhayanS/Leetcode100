class Solution {
    public int countValidSelections(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int count=0;
        for(int i : nums){
            rightSum += i;
        }
        for(int i=0; i<nums.length; i++){

            if(nums[i]==0){
                if(leftSum-rightSum==1 || leftSum-rightSum==-1){
                    count += 1;
                }
                if(leftSum-rightSum==0){
                    count +=2;
                }
            }
            leftSum += nums[i];
            rightSum -= nums[i];
        }
        return count;
    }

    
}