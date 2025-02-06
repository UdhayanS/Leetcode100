class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        char arr1[] = new char[2];
        char arr2[] = new char[2];
        int count = 0;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=(s2.charAt(i))){
                count++;
                if(count>2) return false;
                arr1[count-1]=s1.charAt(i);
                arr2[count-1]=s2.charAt(i);
            }
        }
        if(arr1[0]!=arr2[1] || arr1[1]!=arr2[0]) return false;
        return true;
    }
}