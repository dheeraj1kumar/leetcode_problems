class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int l = nums.length;
        while(l!=0){
        for(int i=0;i<l-1;i++){
            int res=nums[i]+nums[i+1];
            nums[i]=res%10;
        }
        l--;
        }
        return nums[0];
    }
}