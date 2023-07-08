class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
       int head=0,tail=0,maxc=0,len=0;
        
        for(head=0;head<s.length();head++){
            
            
            maxc+=Math.abs(s.charAt(head)-t.charAt(head));//perform operation
                
                while(maxc>maxCost){//if condition fails loop here to make it valid 
                     maxc-=Math.abs(s.charAt(tail)-t.charAt(tail));
                         
                         tail++;//update tail
                }
            len=Math.max(len,head-tail+1);//update ans that have to return
        }
        
        return len;
    }
}