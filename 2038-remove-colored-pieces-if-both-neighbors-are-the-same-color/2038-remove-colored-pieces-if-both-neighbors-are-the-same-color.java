class Solution {
    public boolean winnerOfGame(String colors) {

        int n=colors.length();
        int a=0;
        int b=0;
  char ch[]=colors.toCharArray();
        for(int i=0;i<n-2;i++){
          
            if(ch[i]=='A' && ch[i+1]=='A' && ch[i+2]=='A'){
                a++;
            }
            else if(ch[i]=='B' && ch[i+1]=='B' && ch[i+2]=='B'){
                b++;
            }
        }
        if(a==b){
            return false; 
        }
        else if(a>b){
            return true;
        }
        else if(b>a){
            return false;
        }
        return false;
    }
}

/*count the number of groups of A and B.
if group of A and B are equal return false.
if group of A is more than group of B then return true.
4.if group of B is more than group of A then return false.
5.if none of the above condition met return false.c */