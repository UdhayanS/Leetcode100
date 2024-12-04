class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        char c1[] = str1.toCharArray();
        char c2[] = str2.toCharArray();
        int count=0;
        int i=0, j=0;
        while(i<str1.length() && j<str2.length()){
            if(c1[i]==c2[j]||c1[i]=='z'&&c2[j]=='z'||c1[i]+1 == c2[j] ||c1[i]=='z'&&c2[j]=='a'){
                j++;i++;
            }
            else{
                i++;
            }    
       }  
    return j==str2.length();
    }
}