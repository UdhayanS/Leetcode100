

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>(); // To store numbers seen in the process

        while (n != 1 && !seen.contains(n)) {
            seen.add(n); // Add current number to the set
            n = getSumOfSquares(n); // Update n to the sum of squares of its digits
        }

        return n == 1; // If n equals 1, it is a happy number; otherwise, it is not
    }

    private int getSumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10; // Extract the last digit
            sum += digit * digit; // Add the square of the digit to the sum
            num /= 10; // Remove the last digit
        }
        return sum;
    }
}
