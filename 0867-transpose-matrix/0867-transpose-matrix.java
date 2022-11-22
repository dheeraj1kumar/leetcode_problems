class Solution {
    public int[][] transpose(int[][] m1) {
        int n = m1.length;
	int m = m1[0].length;
int transpose[][] = new int[m][n];

        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++){
                transpose[j][i]=m1[i][j];
            }
        
        
    
    return transpose;
}}





