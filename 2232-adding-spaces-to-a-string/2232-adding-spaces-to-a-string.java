class Solution {
    public String addSpaces(String s, int[] spaces) {
        int n = spaces.length;
        int k=spaces.length-1;
        char[] arr = s.toCharArray();
        //char[] res = new char[s.length()+n-1];
        char[] res = Arrays.copyOf(arr, arr.length+n);
        int m=arr.length-1;
        for(int i=res.length-1; i>=0; i--){
            if(m==-1 || k==-1)
                break;
            if(m+1==spaces[k]){
                res[i]=' ';
                k--;
            }
            else{
                res[i]=arr[m];
                m--;
            }
        }
        if(spaces[0]==0){
            res[0]=' ';
        }
        return new String(res);
    }
}