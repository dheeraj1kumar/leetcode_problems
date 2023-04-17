import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
       BigInteger i=new BigInteger(num1);
        BigInteger j=new BigInteger(num2);
        BigInteger x =i.add(j);
        String s = x.toString(); 
        return s;
    }
}