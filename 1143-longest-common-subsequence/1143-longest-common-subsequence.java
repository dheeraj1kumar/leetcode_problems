class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
       int n=t1.length();
        int m=t2.length();
        int dp[][] = new int[n+1][m+1];
        int max=0;
        
      for (int i =0;i<=m;i++)  dp[0][i] = 0;
        
      for (int i =0;i<=n;i++) dp[i][0] = 0;

        
        
        
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[i].length;j++){
                
                if(t1.charAt(i-1)==t2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                
                else{
                   dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]); 
                }
               
            }
        }
        return dp[n][m];
        
        
    }
}



/*class Solution{
public int longestCommonSubsequence(String text1, String text2) {
int n = text1.length();
int m = text2.length();
return helper(text1 , text2 , n , m);
}
public static int helperR(String x , String y , int n , int m){
    //        base condition
    if (n == 0 || m == 0) return 0;
//        choice diagram
    if (x.charAt(n-1) == y.charAt(m-1)) return 1 + helper(x , y , n-1 , m-1);

    else{
        return Math.max(helper(x , y , n-1 , m) , helper(x , y , n , m-1));
    }
}
}
recursion + memoisatioon
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
         for (int i =0;i<=n;i++){
            for (int j = 0;j<=m;j++){
                t[i][j] = -1;
            }
        }
        return helper(text1 , text2  , n , m);
    }
    static int[][] t = new int[1001][1001];
    public static int helper(String x , String y , int n , int m){
        //        base condition
        if (n == 0 || m == 0) return 0;
//        choice diagram
        if (t[n][m] != -1) return t[n][m];
        if (x.charAt(n-1) == y.charAt(m-1)) return t[n][m] =  1 + helper(x , y , n-1 , m-1);

        else{
            return t[n][m] =  Math.max(helper(x , y , n-1 , m) , helper(x , y , n , m-1));
        }
    }
}
Top-Bottom
public static int helperTOP(String x , String y  , int n , int m){
        int[][] dp = new int[n+1][m+1];
        for (int i =0;i<=m;i++){
            dp[0][i] = 0;
        }
        for (int i =0;i<=n;i++) dp[i][0] = 0;

        for (int i =1;i<=n;i++){
            for (int j = 1;j<=m;j++){
                if (x.charAt(i-1) == y.charAt(j-1)) dp[i][j] = 1+ dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
            }
        }
        return dp[n][m];
    }*/