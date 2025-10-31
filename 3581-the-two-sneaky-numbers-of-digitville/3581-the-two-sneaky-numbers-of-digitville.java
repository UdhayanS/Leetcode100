class Solution {
    public int[] getSneakyNumbers(int[] nums) {
         Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int num : nums){
            if(!set1.add(num)) set2.add(num);
        }
        int arr[] = new int[set2.size()];
        int i=0;
        for(int num : set2){
            arr[i++] = num;
        }
        return arr;
    }
}