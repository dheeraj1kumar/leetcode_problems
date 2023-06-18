class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length==2||nums.length==1){
            return -1;
        }
        Arrays.sort(nums);
      int s=0;
          int e=nums.length;
        int m=s+e/2;
        return nums[m];
    }
}