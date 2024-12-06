class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int[] arr = new int[n+1];
        
        for(int i=0; i<=n; i++){
            arr[i]=i;
            for(int j=0; j<banned.length; j++){
                if(arr[i]==banned[j]){
                    arr[i]=0;
                    break;
                }
            }
        }
        int max=0, count=0;
        for(int i=0; i<=n; i++){
            if(arr[i]!=0){
                if(max<maxSum){
                    max=max+arr[i];
                    count++;
                    if(max>maxSum){
                        count--;
                        return count;
                    }
                    //System.out.print(" "+arr[i]);
                }
            }
        }
        //System.out.println("ans "+Arrays.toString(arr)+max);
        return count;
    }
}