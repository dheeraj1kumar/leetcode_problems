class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int s=0,maxs=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                s=0;
        }
        else if(nums[i]==1){
            s++;
        }
        if(s>maxs){
            maxs=s;
        }}
        return maxs;
    }
}



