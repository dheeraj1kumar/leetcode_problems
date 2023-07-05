class Solution {
    public int longestOnes(int[] nums, int k) {
       
        int head=0;
        int tail=0;
        int len=0;
        int count=0;
        for( head=0;head<nums.length;++head){
            if(nums[head]==0){
                count++;
            }
            while(count>k){
                if(nums[tail]==0)
                    count--;
                tail++;
            }
            len=Math.max(len,head-tail+1);
        }
        return len;
    }
}
