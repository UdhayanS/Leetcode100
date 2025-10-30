public class Solution {
    public int TotalMoney(int n) {
        int weekInc = 1;
        int amount = 0;
        int ind = 1;
        int dayInc = 1;
        while(ind!=n+1){
            amount += dayInc;
            if(ind%7==0){
                weekInc += 1;
                dayInc = weekInc;
            }
            else{
                dayInc++;
            }
            ind++;            
        }
        return amount;
    }
}