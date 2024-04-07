class Solution {
    public boolean checkValidString(String s) {
    //using two pointer
        
        int op=0,cl=0,len=s.length()-1;
        
        for(int i=0;i<=len;i++){
            //count open and *
            if(s.charAt(i)=='('||s.charAt(i)=='*'){
                op++;
            }
            else{
                op--;
            }
            //count close and *
            if(s.charAt(len-i)==')'||s.charAt(len-i)=='*'){
                cl++;
            }
            else{
                cl--;
            }
            
            // If at any point open count or close count goes negative, the string is invalid
            if (op < 0 || cl < 0) {
                return false;
            }
        }
        return true;
    }}
















/*class Solution {
    public boolean checkValidString(String s) {
        
        Stack<Integer> st = new Stack<>();
        Stack<Integer> stric = new Stack<>();
        
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(i);
                }
            
           else if(ch=='*'){
               stric.push(i);
                
            }
            else{
                   if (!st.isEmpty()) {
                st.pop();
              
                }
                else if (!stric.isEmpty()) {
                    stric.pop();
                }
                else {
                    return false;
                } 
            }
        }
        while(!st.isEmpty()&&!stric.isEmpty()){
            if(st.pop()>stric.pop()){
                return false;
            }
        }
        return st.isEmpty();
    }
}*/