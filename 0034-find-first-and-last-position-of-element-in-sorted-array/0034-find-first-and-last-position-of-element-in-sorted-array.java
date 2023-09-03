

// Complexity
// Time complexity:
// 2*O(log(n))

// Space complexity:
// O(1)
// 


class Solution {
    public int[] searchRange(int[] nums, int target) {
      int ans[]=new int[2];
          
          ans[0]=lower(nums,target);
         ans[1]=upper(nums,target);
      return ans;
    }
    
 public int upper(int[] nums,int target){
         int s=0;
        int res=-1;
        int l=nums.length-1;
        while(s<=l){
            int mid = s+(l-s)/2;
           
            if((nums[mid]==target)){
               res=  mid;
             s=mid+1;
            }
            else if(nums[mid]>target){
                l=mid-1;
            }
            else{
               s=mid+1; 
            }}
            return res;
        }
    
    
    
 public  int lower(int[] nums,int target){
      int s=0;
        int res=-1;
        int l=nums.length-1;
        while(s<=l){
            int mid = s+(l-s)/2;
            if((nums[mid]==target)){
               res =  mid;
               l = mid-1;
            }
            else if(nums[mid]>target){
                l = mid-1;
            }
            else{
               s=mid+1; 
            }}
       
       
            return res;
    
    
     }}








