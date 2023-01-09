class Solution {
    public int[] runningSum(int[] nums) {
        int[] s=new int[nums.length];
        int r=0;
        for(int i=0;i<nums.length;i++){
             r+=nums[i];
            s[i]=r;
    }
return s;
    }
  
}


