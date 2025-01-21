class Solution {
    public static int check(int num){
        int ans=0;
        while(num!=0){
            int digit = num%10;
            ans += digit;
            num = num/10;
        }
        if(ans>9) return check(ans);
        return ans;
    }
    public int addDigits(int num) {
        int ans = check(num);
        
        return ans;
    }
}