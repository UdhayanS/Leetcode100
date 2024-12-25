class Solution {
    public static int cal(int num) {
    int ans = 0;
    
    // Process the digits using % and /
    while (num > 0) {
        int digit = num % 10; // Get the last digit
        ans += digit * digit; // Add square of the digit
        num /= 10; // Remove the last digit
    }
    
    // If the result is greater than 9, recursively process it
    if (ans > 9) {
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