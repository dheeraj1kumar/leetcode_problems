class Solution {
    public String reversePrefix(String word, char ch) {
        
        //using two pointer approach
     char[] array = word.toCharArray();
        int i = 0;
        int j = word.length();
        int index = 0;
        while (i < j) {
            if (array[i] == ch) {
                index = i;
                break;
            }
            i++;
        }
        boolean b = index != 0;
        if (b) {
            int x = 0;
            int y = array.length;
            while (x < index) {
                char temp = array[x];
                array[x] = array[index];
                array[index] = temp;
                x++;
                index--;
            }
            return(String.valueOf(array));
        } else {
            return(word);
    }
}}
    
    /*Using string builder
    
    StringBuilder sb=new StringBuilder();
        int index=word.indexOf(ch);
        sb.append(word.substring(0,index+1));
        sb.reverse();
        sb.append(word.substring(index+1));
        return sb.toString();

    
    */