// class Solution {
//     public int maxSubArray(int[] nums) {
//         int max = Integer.MIN_VALUE;
//         for (int i = 0; i < nums.length; i++) {
//             int sum = 0;
//             for (int j = i; j < nums.length; j++) {
//                 sum += nums[j];
//                 if (sum > max)
//                     max = sum;
//             }
//         }
//         return max;
//     }
// }


class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum+nums[i];
            if(max<sum){
                max = sum;
            }
            if(sum<0){
                sum = 0;
            }

        }
        return max;
    }
}
