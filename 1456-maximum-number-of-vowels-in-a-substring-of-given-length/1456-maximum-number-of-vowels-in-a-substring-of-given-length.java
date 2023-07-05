class Solution {
    boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
    public int maxVowels(String s, int k) {
        
        int head=0,tail=0;
        int maxV=0;
        int count=0;
        
         
        for(head=0;head<s.length();head++){
            char ch=s.charAt(head);
            if(isVowel(ch)){
                count++;
            }
        if((head-tail+1)==k){
            maxV=Math.max(maxV,count);
            if(isVowel(s.charAt(tail)))
                count--;
            tail++;
        }
    
        }
        return maxV;
    }
}