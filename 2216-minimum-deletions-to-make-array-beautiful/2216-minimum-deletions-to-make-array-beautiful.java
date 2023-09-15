 class Solution{
public int minDeletion(int[] nums) {
       int count = 0, j = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {  
            
            if (j % 2 == 0 && nums[i] == nums[i + 1]) {
                count++;
            } else {
                j++;
            }
        }
        
        // odd length array
        if ((j + 1) % 2 == 1) {
            count++;
        }
        
        return count; 
    }}