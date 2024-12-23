class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int count = 0, temp = 0, max = 0;

        for (int i = 0; i < n - 1; i++) {
            max = Math.max(max, i + nums[i]);
            if (i == temp) {
                count++;
                temp = max;
            }
        }
        return count;
    }
}