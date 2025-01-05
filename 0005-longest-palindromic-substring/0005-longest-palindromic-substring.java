class Solution {
    public static Boolean isPalindrom(String str){
        String longest = "";
        int left=0, right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String longest="";
        if (s == null || s.length() < 2) return s; // Base cases

        

        for(int i=0; i<s.length()-1; i++){
            for(int j=i; j<s.length(); j++){
                
                String sub = s.substring(i,j+1);
                Boolean status = isPalindrom(sub);
                if(status){
                    if(sub.length()>longest.length())
                    longest= s.substring(i,j+1);
                }
            }
        }
        return longest;
    }
}