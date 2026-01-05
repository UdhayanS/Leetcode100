class Solution {
    public int repeatedNTimes(int[] nums) {
        // Map<Integer, Integer> map =  new HashMap<>();
        // for(int i = 0; i<nums.length; i++){
        //     map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        // }
        // for(int i : map.keySet()){
        //     if(map.get(i)>1) return i;
        // }
        // return 1;

        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return 1;
    }
}