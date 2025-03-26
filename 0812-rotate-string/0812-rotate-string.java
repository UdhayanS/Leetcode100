class Solution {
    public boolean rotateString(String s, String goal) {
        
        for(int i=0; i<s.length(); i++){
            StringBuilder str = new StringBuilder();
            str.append(s.substring(i, s.length()));
            str.append(s.substring(0, i));
            System.out.println(str);
            if(goal.equals(str.toString())){
                return true;
            }
        }
        return false;
    }
}