// class Solution {
//     public int clumsy(int n) {
//         Stack<Integer> stackN = new Stack<>();
//         Stack<String> res = new Stack<>();
//         Stack<String> stackC = new Stack<>();
//         String arr[] = {"*", "/", "+", "-"};
//         int j=0;
//         for(int i=n; i>0 ; i--){
//             stackC.push(Integer.toString(i));
//             if(i!=1) stackC.push(arr[j]);
//             j++;
//             if(j==4) j=0;
//         }
//         //System.out.println(stackN.peek());
//         System.out.println(stackC);
//         int current = 0;
//         for(int i=0; i<n; i++ ){
//             if(stackC.peek("*")){
                
//                 int n1 = Integer.parseInt(stackC.pop());
//                 stackC.pop();
//                 int n2 = Integer.parseInt(stackC.pop());
//                 current = n1*n2;
//                 res.push(Integer.toString(current));
//                 current = 0;
//             }
//             else if(stackC.peek("/")){
                
//                 int n1 = Integer.parseInt(stackC.pop());
//                 stackC.pop();
//                 int n2 = Integer.parseInt(stackC.pop());
//                 current = n1/n2;
//                 res.push(Integer.toString(current));
//                 current = 0;
//             }
//         }
//         System.out.println(res);
//         return 1;
//     }
// }


class Solution {
    public int clumsy(int n) {
        Stack<Integer> stackN = new Stack<>();
        stackN.push(n);
        n--;
        int index=0;
        while(n>0){
            index = index%4;
            if(index==0){
                stackN.push(stackN.pop()*n);
            }
            else if(index==1){
                stackN.push(stackN.pop()/n);
            }
            else if(index==2){
                stackN.push(n);
            }
            else if(index==3){
                stackN.push(-n);
            }
            n--;
            index++;
        }
        int sum=0;
        for(int nn : stackN){
            sum += nn;
        }
        return sum;
    }
}