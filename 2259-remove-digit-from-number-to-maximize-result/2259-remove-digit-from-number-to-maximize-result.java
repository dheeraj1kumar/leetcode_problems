class Solution {
    public String removeDigit(String n, char d) {
     
        String result = "";
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)==d){
     String num = n.substring(0, i) + n.substring(i + 1);
            if(num.compareTo(result)>0){
                    result = num;
                }
        }}
       
        return result;
        
    }
}

/*When ever it encounter the digit, we form a temp string excluding digit. The value of our result string and temp string can be directly compared using .compareTo method. If temp is greater than result then update result.*/