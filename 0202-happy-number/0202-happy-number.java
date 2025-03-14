class Solution {
    public static int cal(int num){
        
        // String nS = Integer.toString(num);
        // int ans=0;
        // for(int i=0; i<nS.length(); i++){
        //     int temp = nS.charAt(i) - '0';
        //     ans = ans+(int)Math.pow(temp,2);
        // }
        // if(ans>9) return cal(ans);
        // return ans;

        int ans=0;
        while(num>0){
            int digit = num%10;
            ans += digit*digit;
            num=num/10;
        }
        if(ans>9){
            return cal(ans);
        }
        return ans;
    }
    public boolean isHappy(int n) {
        
        int ans = cal(n);
        if(ans==7) return true;
        if(ans<10 && ans==1) return true;
        return false;
    }
}