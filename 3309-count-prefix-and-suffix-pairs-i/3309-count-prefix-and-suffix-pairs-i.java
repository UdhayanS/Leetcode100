class Solution {
    public static Boolean isPrefixAndSuffix(String str1, String str2){
        int s1 = str1.length();
        int s2 = str2.length();
        if(s2<s1) return false;
        String prefix = str2.substring(0, s1);
        String sufix = str2.substring(s2-s1, s2);
        if(prefix.equals(str1) && sufix.equals(str1)) return true;
        return false;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0; i<words.length-1; i++){
            for(int j=i+1; j<words.length; j++){
                Boolean res = isPrefixAndSuffix(words[i], words[j]);
                if(res==true) count++;
            }
        }
        return count;
    }
}