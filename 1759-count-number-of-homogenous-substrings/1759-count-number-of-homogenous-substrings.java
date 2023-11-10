class Solution {
    public int countHomogenous(String s) {
       if(s.length()<=1) return s.length();
        int[] dp=new int[s.length()];
        Arrays.fill(dp,1);
        for(int i=1; i<dp.length ; i++){
            if(s.charAt(i)==s.charAt(i-1)){
                dp[i]=dp[i-1]+1;
            }
        }
        int sum=0;
        for(int i=0; i<dp.length ; i++){
            sum+=dp[i];
            sum%=1000000007;
        }
        return sum; 
    }
}