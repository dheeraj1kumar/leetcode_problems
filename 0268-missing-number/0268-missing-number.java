class Solution {
    public  int missingNumber(int[] nums) {
   
        int n=nums.length,totalsum=n*(n+1)/2; //sum of first n natural numbers
        for(int i:nums)
            totalsum-=i;
        return totalsum;
        
    }
}

/*

class Solution 
{
    int MissingNumber(int a[], int n) {
    Arrays.sort(a);
    int s=0;
    int s1=n*(n+1)/2;
    for(int i=0;i<a.length;i++){
       s+=a[i];
        }
    
    
    return s1-s;
    
}}



*/