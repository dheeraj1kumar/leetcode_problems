class Solution {
    public int specialArray(int[] nums) {
        int n= nums.length;
        
        for(int i=1;i<1000;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(nums[j]>=i){
                    c++;
                               }
            }
           if(c==i){
               return i;
           }
            
        }
        return -1;
    }
}

