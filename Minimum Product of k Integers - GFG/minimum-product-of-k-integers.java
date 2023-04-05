//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            
            Solution obj = new Solution();
            
            System.out.println(obj.minProduct(a,n,k));
        }
        
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    
    int minProduct(int arr[], int n,int k)
    {
        Arrays.sort(arr);

        long c=1;
        for(int i=0;i<k;i++){
        // Complete the function
        c  = c*arr[i]%1000000007;
        }
        return (int)c;
    }   
}

