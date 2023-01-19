class Solution {
    public int averageValue(int[] n) {
        int s=0;
        int c=0;
        for(int i=0;i<n.length;i++){
if(n[i]%3==0&&n[i]%2==0){
        s+=n[i];
            c++;
   // return s/c;
    }
       
        }
        return s==0?0:s/c;
    }
}