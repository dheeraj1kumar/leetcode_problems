class Solution {
    public int getSum(int a, int b) {
       /* for (int i = 1; i <= b; i++)
            a++;
        return a;*/

        while(b!=0){
            int carry=a&b;
            a=a^b;
            b=carry<<1;

        }
        return a;
    }
}