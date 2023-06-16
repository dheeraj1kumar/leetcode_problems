class Solution {
    public int[] productExceptSelf(int[] nums) {
       int ans[] = new int[nums.length];
        int pre = 1, post = 1;
        
        //find pre product
        for(int i=0;i<nums.length;i++){
            ans[i] = pre;
            pre*=nums[i];
        }

        //find post product
        for(int i=nums.length-1;i>=0;i--){
            ans[i]*=post;
            post*=nums[i];
        }

        return ans;  
    }
}