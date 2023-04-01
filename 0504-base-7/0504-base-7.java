class Solution {
    public String convertToBase7(int num) {
        String s=String.valueOf(num);  
         String r= Integer.toString(Integer.parseInt(s, 10), 7);

    return r;
    }
}