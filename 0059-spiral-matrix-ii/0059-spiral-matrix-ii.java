class Solution {
    public int[][] generateMatrix(int n) {
        int[][] t=new int[n][n];
        int k=1;
        int top=0;
        int buttom=n-1;
        int left=0;
        int right=n-1;
        int dir=1;
        int count=(buttom+1)*(buttom+1);
        
        while(left<=right&&top<=buttom){
            if(count>0){
                if(dir==1){
                    for(int i=left;i<=right;i++){
                     t[top][i]=k++;
                         count--;
                    }
                
                dir=2;
                top++;
            }
        }
     if(count>0){
                if(dir==2){
                    for(int i=top;i<=buttom;i++){
                     t[i][right]=k++;
                         count--;
                    }
                
                dir=3;
                right--;
     }}
    if(count>0){
                if(dir==3){
                    for(int i=right;i>=left;i--){
                     t[buttom][i]=k++;
                         count--;
                    }
                
                dir=4;
                buttom--;
    }}
if(count>0){
                if(dir==4){
                    for(int i=buttom;i>=top;i--){
                     t[i][left]=k++;
                         count--;
                    
                }
                dir=1;
                left++;
}}}
return t;
    }
}

