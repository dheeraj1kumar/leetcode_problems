//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String s = br.readLine();
            
            Solution obj = new Solution();
            System.out.println(obj.lastIndex( s));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    public int lastIndex( String s) {
    //     int n=s.length();
    //     if(n==2){
    //   return s.lastIndexOf( "1",s.length()-2);
    //   }
    //   else if(n>=1) {
    //   return s.lastIndexOf( "1",s.length()-1);
    //   }
    //   else
     return s.lastIndexOf( "1",s.length()); 
    }
}