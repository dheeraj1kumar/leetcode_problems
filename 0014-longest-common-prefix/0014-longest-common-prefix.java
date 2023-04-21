class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        String s1=strs[0];
        String s2 =strs[strs.length-1];
        String str="";
        int i=0,j=0;
        
        while(i<s1.length()&&j<s2.length()){
            char ch1=s1.charAt(i);
                char ch2=s2.charAt(j);
            if(ch1!=ch2)
                break;
            else
                str+=ch1;
            i++;
            j++;
        }
        return str;
    }
}