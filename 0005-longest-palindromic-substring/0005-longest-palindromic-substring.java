class Solution {
    // Helper method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        String longest = "";
        
        if (s == null || s.length() < 2) return s; // Base case for null or single-character strings

        // Iterate through all substrings
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1); // Substring from i to j (inclusive)
                
                // Check if the substring is a palindrome
                if (isPalindrome(sub)) {
                    // Update the longest palindrome if this one is longer
                    if (sub.length() > longest.length()) {
                        longest = sub;
                    }
                }
            }
        }

        return longest;
    }
}
