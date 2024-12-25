class Solution {
    public static int cal(int num){
        
        String nS = Integer.toString(num);
        int ans=0;
        for(int i=0; i<nS.length(); i++){
            int temp = nS.charAt(i) - '0';
            ans = ans+(int)Math.pow(temp,2);
        }
        if(ans>9) return cal(ans);
        return ans;
    }
    public boolean isHappy(int n) {
        
        int finalA = cal(n);
        if(finalA==7) return true;
        if(finalA<10 && finalA!=1) return false;
        if(finalA<10 && finalA==1) return true;
        return false;
    }
}