class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] result = new long[nums.length];
        long max=0, ans=0;
        for(int i=0; i<nums.length; i++){
            max = Math.max(max, nums[i]);
            ans += nums[i]+max;
            result[i] = ans;
        }
        return result;
    }
}