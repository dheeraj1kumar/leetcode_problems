class Solution {
    public int majorityElement(int[] n) {
   
     Arrays.sort(n);
        if(n.length==1){
             
        return n[0];}
       
     
        int c=0;
        for(int i=0;i<n.length-1;i++){
            
            if(n[i]==n[i+1]){
                   
               c++;}
                if(c>=n.length/2){
                    
                return n[i];
                }
        }
  return -1;
 }
     
}