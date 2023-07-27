class Solution {
    public boolean areOccurrencesEqual(String s) {
        int count=0;
       HashMap<Character,Integer> map =new HashMap<>();
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
         map.put(ch,map.getOrDefault(ch,0)+1);
    }
        count = map.get(s.charAt(0));
        for(char key:map.keySet()){
            if(map.get(key)!=count)
                return false;
        }
        return true;
}
}
    
    