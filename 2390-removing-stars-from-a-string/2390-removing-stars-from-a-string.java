class Solution {
    public String removeStars(String s) {
     ArrayList<Character> st=new ArrayList<>();

     for(int i=0;i<s.length();i++){
         char ch=s.charAt(i);
         if(ch!='*'){
             st.add(ch);
         }
         else if(ch=='*'){
             st.remove(st.size()-1);
         }
        
     }  
     String sp="";
     for(int i=0;i<st.size();i++){
         sp+=st.get(i);
     } 
     return sp;
    }
}