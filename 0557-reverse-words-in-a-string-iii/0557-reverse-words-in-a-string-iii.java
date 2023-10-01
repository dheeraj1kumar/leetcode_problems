class Solution {
    public String reverseWords(String s) {
      String words[]= s.split("\\s");//convert string to array's string
        String str = "";
        for(String w:words){
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();//reverse the string
            str+=sb.toString()+" ";//convert array string to string
            
        }
        return str.trim();//remove extra space trim() method
    }
}