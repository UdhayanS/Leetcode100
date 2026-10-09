class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> set = new HashMap<>();
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++){
            int needed = target - nums[i];
            if(set.containsKey(needed)){
                res[0] = set.get(needed);
                res[1] = i;
                return res;
            }
            set.put(nums[i], i);
        }
        return res;
    }
}