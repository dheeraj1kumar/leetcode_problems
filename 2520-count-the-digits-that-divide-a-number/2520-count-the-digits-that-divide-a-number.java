class Solution {
    public int countDigits(int num) {
        int n = num, cnt = 0;
        while ( n > 0 ){
            int rem = n%10;
            n = n/10;
            if ( num % rem == 0 ) cnt++;
        }
        return cnt;
    }
}