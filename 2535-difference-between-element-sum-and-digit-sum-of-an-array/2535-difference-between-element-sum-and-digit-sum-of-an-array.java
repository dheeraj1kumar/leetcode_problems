class Solution {
    public int differenceOfSum(int[] n) {
        int s=0,a=0;
        for(int i=0;i<n.length;i++){
            s+=n[i];
        
while(n[i]>0){
int r=n[i]%10;
 a+=r;
    n[i]/=10;

}
              }
        return Math.abs(a-s);
    }
}

