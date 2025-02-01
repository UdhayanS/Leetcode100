class Solution {
    public static String cal(String str){
        StringBuilder res = new StringBuilder();
        int count = 1;
        if(str.equals("1")) return "11";
        int flag=0;
        for(int i=0; i<str.length()-1; i++){
            char ch = str.charAt(i);
            if(ch==str.charAt(i+1)){
                //res.append(count);
                //res.append(ch);
                count++;
                flag=1;
            }
            else{
                res.append(count);
                res.append(ch);
                count=1;
            }
            

        }
        
        res.append(count);
        res.append(str.charAt(str.length()-1));
        return res.toString();
   
    }
    public String countAndSay(int n) {
        if(n==1) return "1";
        String str = "1";
        for(int i=0; i<n-1; i++){
            str = cal(str);
            // System.out.println(str);
        }
        return str.toString();

    }
}