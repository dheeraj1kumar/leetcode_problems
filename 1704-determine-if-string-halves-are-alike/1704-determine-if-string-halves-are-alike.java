class Solution {
    public boolean halvesAreAlike(String s) {
        
        int a =0, b = 0;
        
        int l = s.length()/2;
        
        for(int i=0;i<l;i++){
            
            char ch = s.charAt(i);
            
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                
                a++;
            
        }}
        
        for(int i = l;i<s.length();i++){
            
            char ch = s.charAt(i);
             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                
                b++;
            
        }
        }
    
    return a==b?true:false;
    }
}