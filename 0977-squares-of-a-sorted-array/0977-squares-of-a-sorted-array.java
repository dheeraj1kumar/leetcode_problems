class Solution {
    public int[] sortedSquares(int[] nums) {
       
        double b[]=new double[nums.length];
        int n[]=new int[nums.length];
        double p=0;
        for(int i=0;i<nums.length;i++){
            b[i]=Math.pow(nums[i],2);
            
            }
         Arrays.sort(b);
        for(int i=0;i<nums.length;i++){
            n[i]=(int)b[i];
        }
        return n;
    }
}

