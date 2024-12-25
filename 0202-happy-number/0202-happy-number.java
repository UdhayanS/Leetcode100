

class Solution {
    public static int cal(int num) {
        int ans = 0;
        while (num > 0) {
            int digit = num % 10; // Extract the last digit
            ans += digit * digit; // Add the square of the digit to the sum
            num /= 10; // Remove the last digit
        }
        return ans;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>(); // To store numbers seen in the process

        while (n != 1 && !seen.contains(n)) {
            seen.add(n); // Add current number to the set
            n = cal(n); // Update n to the sum of squares of its digits
        }

        return n == 1; // If n equals 1, it is a happy number; otherwise, it is not
    }
}
