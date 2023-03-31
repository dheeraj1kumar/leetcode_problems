class Solution {
    public int arraySign(int[] n) {
        double s=1;
        for(int i=0;i<n.length;i++){
            s*=n[i];
        }
        if(s>0){
            return 1;
        }
        else if(s<0){
            return -1;
        }
   else{
       return 0;
   }
    }
}