class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int res[] = new int[2];
        int aliceSize=0;
        int bobSize=0;
        for(int i=0; i<aliceSizes.length; i++){
            aliceSize += aliceSizes[i];
        }
        for(int i=0; i<bobSizes.length; i++){
            bobSize += bobSizes[i];
        }
        
        for(int i=0; i<aliceSizes.length; i++){
            for(int j=0; j<bobSizes.length; j++){
                aliceSize = aliceSize-aliceSizes[i];
                bobSize = bobSize-bobSizes[j];
                aliceSize = aliceSize+bobSizes[j];
                bobSize = bobSize+aliceSizes[i];
                if(aliceSize == bobSize){
                    res[0] = aliceSizes[i];
                    res[1] = bobSizes[j];
                    return res;
                }
                else{
                    aliceSize = aliceSize-bobSizes[j];
                bobSize = bobSize-aliceSizes[i];
                aliceSize = aliceSize+aliceSizes[i];
                bobSize = bobSize+bobSizes[j];
                }
            }
        }
        return res;
    }
}