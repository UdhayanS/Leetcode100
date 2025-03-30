// class Solution {
//     public void nextPermutation(int[] nums) {
//         int res = permutation(nums, 0);
//         System.out.println(res);

//     }

//     public static int permutation(int arr[], int index){
//         List<Integer> list = new ArrayList<>();
//         if(index == arr.length-1){
//             int nums = Integer.valueOf(arr);
//             list.add(nums);
//             return 1;
//         }

//         for(int i=index; i<arr.length; i++){
//             swap(arr, index, i);
//             permutation(arr, index+1);
//             swap(arr, index, i);
//         }
//         Collections.sort(list);
//         String arrSum = String.valueOf(arr);
//         for(int i=0; i<list.size(); i++){
//             if(list.get(i)==Integer.parseInt(arrSum)){
//                 return list.get(i+1);
//             }
//         }
//         return -1;
//     }

//     static void swap(int arr[], int i, int j){
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
// }

// class Solution {
//     public void nextPermutation(int[] nums) {
//         int lastDigit = nums[nums.length - 1];
//         boolean status = false;

//         // Step 1: Find the first decreasing element from the right
//         for (int i = nums.length - 2; i >= 0; i--) {
//             if (nums[i] < nums[i + 1]) { // Found the pivot
//                 // Step 2: Find the rightmost element greater than nums[i]
//                 for (int j = nums.length - 1; j > i; j--) {
//                     if (nums[j] > nums[i]) {
//                         swap(nums, i, j); // Swap pivot with the next larger element
//                         break;
//                     }
//                 }
//                 // Step 3: Reverse the right portion after i to get the next permutation
//                 swap(nums, i + 1, nums.length - 1);
//                 status = true;
//                 return;
//             }
//         }

//         // If no next permutation exists, sort the array (smallest permutation)
//         if (!status) {
//             Arrays.sort(nums);
//         }
//     }
//       public static void swap(int arr[], int i, int j) {
//         while (i < j) {
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             i++;
//             j--;
//         }}
// }



class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        int j = nums.length-1;
        if(i>=0){
            while(j>=0 && nums[j]<=nums[i]){
            j--;
        }
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        }
        i++;
        j=nums.length-1;
        while(i<j){
            int temp2 = nums[i];
            nums[i] = nums[j];
            nums[j] = temp2;
            i++;
            j--;
        }
        
        
    }
}