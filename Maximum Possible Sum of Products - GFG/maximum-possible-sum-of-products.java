//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int N = Integer.parseInt(read.readLine().trim());
            long []A = new long[N];
            long []B = new long[N];
            String input_line[] = read.readLine().trim().split("\\s+");
            for(int i=0;i<N;i++)
                A[i]=Integer.parseInt(input_line[i]);
            input_line = read.readLine().trim().split("\\s+");
            for(int i=0;i<N;i++)
                B[i]=Integer.parseInt(input_line[i]);
            
            Solution obj = new Solution();
            System.out.println(obj.MaxSum(A, B, N));
            
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    long MaxSum(long []A, long []B, int N) 
    { 
        Arrays.sort(A);
        Arrays.sort(B);
       long a=0;
        for(int i=0;i<A.length;i++){
            
             a+=(A[i]*B[i]);
            }
        
        return a;
    }
} 