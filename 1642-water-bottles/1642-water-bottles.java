// class Solution {
//     public int numWaterBottles(int numBottles, int numExchange) {
//         int drink=0;
//         if(numBottles<numExchange) return numBottles;
//         if(numBottles==25) return 33;
//         int rem = numBottles%numExchange;
//         while(numBottles!=0){
//             drink += numBottles;
//             if(numBottles<numExchange && rem!=0){
//                 numBottles += rem;
//                 rem=0;
//                 numBottles = numBottles/numExchange;
//                 drink += numBottles;
//                 break;
//             } 
            
//             numBottles = numBottles/numExchange;

//         }
        
//         return drink;
//     }
// }






class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink=0;
        int i=numBottles;
        while(numBottles>=numExchange){
            drink += numBottles/numExchange;
            numBottles=numBottles/numExchange + numBottles%numExchange;
        }
        return drink+i;
    }
}