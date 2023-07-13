class Solution {
    public long zeroFilledSubarray(int[] nums) {
        
       int head=0,tail=0,count=0;
            long ans=0;
        while(head!=nums.length){
            if(nums[head]!=0){
               
               head++;
            
            tail=head;
               
            }
            
            else{
              ans+=head-tail+1;
                head++;
            
            
            }
        }
        return ans;
    }
}



/*

//by using Maths concept:

public long zeroFilledSubarray(int[] nums) {
        
       int head=0,tail=0,count=0;
            long ans=0;
        for(head=0;head<nums.length;head++){
            if(nums[head]==0){
                count++;
            }
            else{
                count=0;
            }
            
           ans+=count; 
        }
        return ans;*/
