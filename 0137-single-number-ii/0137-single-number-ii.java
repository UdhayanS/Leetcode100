class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)){
                res.add(num);
            }
        }
        for(int num : set){
            if(!res.contains(num)) return num;
        }
        return 1;
    }
}