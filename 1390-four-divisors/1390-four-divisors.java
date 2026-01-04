class Solution {
    public int sumFourDivisors(int[] nums) {
        int result = 0;
        for(int i=0; i<nums.length; i++){
           // List<Integer> list = new ArrayList<>();
            int sum = 0;
            int count = 0;
            for(int j=1; j<=nums[i]; j++){
                if(nums[i]%j == 0){
                    sum+=j;
                    count++;
                    if(count>4) break;
                    //list.add(j);
                }

            }
            if(count==4) result+=sum;
            
        }
        return result;
    }
}