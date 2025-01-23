class Solution {
    public int maximum69Number (int num) {
        int max = num;
        
        String str = Integer.toString(num);
        int arr[] = new int[str.length()];
        // for(char ch : str.toCharArray()){
        //     arr[]
        // }
        for(int i=0; i<str.length(); i++){
            arr[i] = (int)str.charAt(i)-48;
        }
        for(int i=0; i<str.length(); i++){
            if(arr[i]==9){
                int n=6;
                int sum=0;
                for(int j=0; j<arr.length; j++){
                    if(i==j){
                        sum = sum*10 + n;
                    }
                    else{
                        sum = sum*10 + arr[j];
                    }  
                }
                max = Math.max(sum, max);
            }
            if(arr[i]==6){
                int n=9;
                int sum=0;
                for(int j=0; j<arr.length; j++){
                    if(i==j){
                        sum = sum*10 + n;
                    }
                    else{
                        sum = sum*10 + arr[j];
                    }  
                }
                max = Math.max(sum, max);
            }
        }
        return max;
    }
}