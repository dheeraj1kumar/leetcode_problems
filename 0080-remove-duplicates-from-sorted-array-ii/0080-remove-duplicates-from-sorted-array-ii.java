class Solution {
    public int removeDuplicates(int[] nums) {
        int count =0;
        int index=1;
       
     for(int si=1;si<nums.length;si++){
            if(nums[si]==nums[si-1]){
               count++;}
                else {
                    count =0;
                }
            if(count<=1){
                nums[index]=nums[si];
                index++;
            }
         
        }
        return index;
    }
}

