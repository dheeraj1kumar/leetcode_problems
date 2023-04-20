class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
         int sum =0;
        if(k > numOnes){
            sum += numOnes;
            k = k - numOnes;
        }
        else{
            sum += k;
            k =0;
        }
            k = k - numZeros;
      
        if(k > 0){
            if(k < numNegOnes){
                sum = sum -k;
            }
          else{
              sum = sum - numNegOnes;
          }
        }
        return sum;
            
    }
}