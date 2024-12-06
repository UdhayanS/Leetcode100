class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        boolean[] arr = new boolean[n+1];

        for (int num : banned) {
            if(num<=n)
                arr[num] = true;
        }

        int max = 0, count = 0;
        for (int i = 1; i <= n; i++) {
            if (arr[i] != true) {
                max = max + i;
                if (max <= maxSum) {
                    count++;
                    // System.out.println("ans " +i);
                } else
                    break;

            }
        }
        // System.out.println("ans "+ +max);
        return count;
    }
}