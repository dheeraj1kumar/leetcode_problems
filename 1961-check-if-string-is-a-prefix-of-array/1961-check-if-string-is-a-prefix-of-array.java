class Solution {
    public boolean isPrefixString(String s, String[] words) {
        
      StringBuilder st=new StringBuilder();
        for(int i=0;i<words.length;i++){
            st.append(words[i]);
        
        if(s.equals(st.toString())){
            return true;
        }}
     return false;
    }
}
