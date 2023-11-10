// class Solution {
//     public int countHomogenous(String s) {
//        if(s.length()<=1) return s.length();
//         int[] dp=new int[s.length()];
//         Arrays.fill(dp,1);
//         for(int i=1; i<dp.length ; i++){
//             if(s.charAt(i)==s.charAt(i-1)){
//                 dp[i]=dp[i-1]+1;
//             }
//         }
//         int sum=0;
//         for(int i=0; i<dp.length ; i++){
//             sum+=dp[i];
//             sum%=1000000007;
//         }
//         return sum; 
//     }
// }

class Solution {
    public int countHomogenous(String s) {
        int prev = 1;
    int sum = 1;
    int m = 1000000007;
    for(int i = 1; i < s.length(); i++)
    {
        int curr = 1;
        if(s.charAt(i) == s.charAt(i-1))
        {
            curr = (curr + prev) % m;
        }
        sum = (sum + curr) % m;
        prev = curr;
    }
    return sum;
    }
}