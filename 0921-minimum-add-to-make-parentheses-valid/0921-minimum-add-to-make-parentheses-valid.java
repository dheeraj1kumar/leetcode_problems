class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int ob=0,cb=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                ob++;}
else{
    
    if(ob>0)
        ob--;
    
    else
        cb++;
    
}            
        }
            return ob+cb;
    }
}

//*Using Stack
/*class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(c);
            }else if(c==')' && st.size()>0 && st.peek()=='('){
                st.pop();
            }else{
                st.push(c);
            }
        }
        return st.size();
    }
}*/