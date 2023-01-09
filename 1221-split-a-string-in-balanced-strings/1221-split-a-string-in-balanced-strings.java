// class Solution {
//     public int balancedStringSplit(String s) {
//        String r="RL";
//         int res=0;
//         for(int i=0;i<s.length()-r.length();i++){
//             int j=0;
//             for( j=0;j<r.length();j++){
//                 if(s.charAt(i+j)!=r.charAt(j)){
//                     break;
//                 }}
            
//             if(j==r.length()){
//                 res++;
//                 j=0;
//             }}
//         return res;
//     }
// }
        

class Solution {
    public int balancedStringSplit(String s) {
        int countLR=0;
        int count=0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='R')
                countLR++;
            else if(s.charAt(i)=='L')
                countLR--;
            if(countLR==0)
                count++;
            i++;
        }
        return count;
    }
}