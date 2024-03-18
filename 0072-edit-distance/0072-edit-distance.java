// class Solution {
//     public int minDistance(String w1, String w2) {
        
//         int n = w1.length();
//         int m = w2.length();
        
//         int dp[][] =  new int[n+1][m+1];
        
       
//         // Initialize first row and first column
//         for(int i=0;i<n+1;i++){
//             dp[i][0]=i;
//         }
//         for(int j=0;j<m+1;j++){
//             dp[0][j]=j;
//         }
        
        
//         // Dynamic Programming to fill the table
//         for(int i=1;i<dp.length;i++){
//             for(int j=1;j<dp[0].length;j++){
                
//                 if(w1.charAt(i-1)==w2.charAt(j-1)){
//                     dp[i][j]= dp[i-1][j-1];
//                 }
//                 else{
//                  dp[i][j]  = Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]))+1;
//                 }
//             }
//         }
//         return dp[n][m];
//     }
// }

class Solution {
    public int solve(String str1,int m, String str2, int n,int[][] dp){
        if(m==0 && n==0) return 0;
        if(m==0) return n;
        if (n==0) return m;
        if(dp[m][n]!=-1) return dp[m][n];
        if(str1.charAt(m-1)==str2.charAt(n-1)){
            dp[m][n]=solve(str1,m-1, str2, n-1,dp);
        }
        else{
              int i=0,d=0, r=0;
             i=solve(str1,m, str2, n-1,dp)+1;
             d=solve(str1,m-1, str2, n,dp)+1;
             r=solve(str1,m-1, str2, n-1,dp)+1;
         dp[m][n]= Math.min(i,Math.min(d,r));
        }
       return dp[m][n];
    }
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int[][] dp= new int[m+1][n+1];
        for(int[] arr:dp) Arrays.fill(arr,-1);
        return solve(word1,m,word2,n,dp);
    }
}