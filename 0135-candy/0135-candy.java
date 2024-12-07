class Solution {
    public int candy(int[] ratings) {
        int can[] = new int[ratings.length];
        int sum=0;
        for(int i=0 ; i<ratings.length ; i++){
            can[i] = 1;
        }
        for(int i=1; i<ratings.length; i++){
            if(ratings[i]>ratings[i-1]){
                can[i]=can[i-1]+1;
            }
        }
        for(int i=ratings.length-2; i>=0; i-- ){
            if(ratings[i]>ratings[i+1]){
                can[i]=Math.max(can[i], can[i+1]+1);
            }
        }
        for(int i=0; i<ratings.length; i++){
            sum = sum+can[i];
        }
        return sum;
    }
}