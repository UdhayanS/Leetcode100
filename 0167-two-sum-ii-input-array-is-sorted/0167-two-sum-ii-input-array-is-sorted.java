class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[] = new int[2];
        //int k=0;
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i]+numbers[j]==target){
                    arr[0]=i+1;
                    //k++;
                    arr[1]=j+1;
                    return arr;
                }
            }
        }
        return arr;
    }
}


// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
        
//         int k=0;
//         int left=0;
//         int right=numbers.length-1;
//         while(left<right){
//             int ans = numbers[left]+numbers[right];
//             if(ans==target){
//                 return new int[]{left+1, right+1};
//             }
//             if(ans>target){
//                 right--;
//             }
//             else{
//                 left++;
//             }
//         }
//         return new int[]{left+1, right+1};
//     }
// }