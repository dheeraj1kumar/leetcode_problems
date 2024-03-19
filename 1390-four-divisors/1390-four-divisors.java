class Solution {
    public int sumFourDivisors(int[] nums) {
        
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            sum += divisor(nums[i]);
           
        }
        return sum;
        
    }
    
  public  int divisor(int n){
        int s=0;
      int c=0;
      for(int i=1;i<=n;i++){
          if(n%i==0){
              s+=i;
              c++;
          }
          if(c>4){
              return 0;
          }
         
      }
       if(c<4){
              return 0;
          }
         System.out.print(s+" ");
      return s;
      
    }
}