class Solution {
    public int[] smallerNumbersThanCurrent(int[] n) {
        int [] a=new int[n.length];

        
        for(int i=0;i < n.length;i++){
                    int c=0;
            for(int j=0;j<n.length;j++){
            if(n[i]>n[j]){
                
          c++;
                }
              
            }
          a[i]=c;}
        return a;
    }
}