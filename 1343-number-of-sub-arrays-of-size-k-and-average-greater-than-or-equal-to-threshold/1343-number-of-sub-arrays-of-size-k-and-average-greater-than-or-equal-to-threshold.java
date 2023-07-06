class Solution {
    public int numOfSubarrays(int[] arr, int k, int thre) {
        
        int head=0,tail=0,sum=0,count=0;
        
       while(head<arr.length){
                sum+=arr[head];
               if((head-tail+1)<k){
                   head++;
            }
          
            else if((head-tail+1)==k){
                if(sum/k>=thre)
             
             count++;
                  sum-=arr[tail];
                
              head++;
                tail++;
        }
           
       }
        return count;
    }
}

       