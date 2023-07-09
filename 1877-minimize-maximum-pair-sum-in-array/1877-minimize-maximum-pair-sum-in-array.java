class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
      int  max=0;
        int result=0;
        
        int si=0;
        int li=nums.length-1;
      while(si<li){
          
           result=nums[si]+nums[li];
          if(result>max)
              max=result;
          si++;
          li--;
          
      }
        return max;
    }
}

/*
Arrays.sort(nums);
        int i = 0,j = nums.length-1,max = -1;
        while(i<j) max = Math.max(nums[i++]+nums[j--],max);
        return max;
        
*/


//
/*
 Arrays.sort(A);
        int res = 0, n = A.length;
        for (int i = 0; i < n / 2; ++i)
            res = Math.max(res, A[i] + A[n - i - 1]);
        return res;
*/


