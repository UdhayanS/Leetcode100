class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        long[] result = new long[n];
        long max = 0, prefixSum = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]); // Update the maximum value.
            prefixSum += nums[i] + max;  // Compute the cumulative prefix score.
            result[i] = prefixSum;       // Store the result.
        }

        return result;
    }
}
