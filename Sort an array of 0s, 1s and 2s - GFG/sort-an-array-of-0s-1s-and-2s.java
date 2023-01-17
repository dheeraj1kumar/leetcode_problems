//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

// class Solution
// {
//     public static void sort012(int a[], int n)
//     {
//         // code here
//         int
//         for(int i=0;i<a.length;i++){
//             for(int j=0;j<a.length-1-i;j++){
//                 if(a[j]>a[j+1]){
//                     int temp =a[j];
//                     a[j]=a[j+1];
//                     a[j+1]=temp;
//                 }
//             }
//         }
//     }
// }

// class Solution
// {
//     public static void sort012(int a[], int n)
//     {
//       Arrays.sort(a);
        
        
        
        
        
//     }}

class Solution
{
    public static void sort012(int a[], int n){
        
       int z=0;
       int o=0;
       int t=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                z++;
            }
            else if(a[i]==1){
                o++;
            }
            else{
                t++;
            }
        }
            for(int i=0;i<n;i++){
                if(z>0){
                    a[i]=0;
                    z--;
                }
               else  if(o>0){
                    a[i]=1;
                    o--;
                }
                else{
                    a[i]=2;
                }
            }
        }
        
    }

    







//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends