class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
     //use sliding window
         if (k<=1) return 0;
        int head=0,tail=0,count =0,prod=1;
        
        for(head=0;head<nums.length;head++){
           
            prod*=nums[head];
        
            while(prod>=k){
                prod/=nums[tail];
                tail++;
                
            }
            count+=head-tail+1;
        } 
         return count;   
    }
}
