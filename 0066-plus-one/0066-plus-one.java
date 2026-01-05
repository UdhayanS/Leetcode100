class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length-1;
        if(digits.length == 1 && digits[i]!=9){
            digits[0] = digits[0]+1;
            return digits;
        } 
        while(i!=-1){
            if(digits[i]!=9){
                digits[i] = digits[i]+1;
                return digits;
            }
            digits[i] = 0;
            i--;
        }
        int arr[] = new int[digits.length+1];
        arr[0] = 1;
        return arr;
    }
}