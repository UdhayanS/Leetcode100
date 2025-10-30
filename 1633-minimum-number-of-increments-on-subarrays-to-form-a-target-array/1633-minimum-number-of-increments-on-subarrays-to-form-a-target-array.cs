public class Solution {
    public int MinNumberOperations(int[] target) {
        int count = target[0];
        for(int i=1; i<target.Length; i++){
            int sum = target[i]-target[i-1];
            count += Math.Max(sum, 0);
        }
        return count;
    }
}