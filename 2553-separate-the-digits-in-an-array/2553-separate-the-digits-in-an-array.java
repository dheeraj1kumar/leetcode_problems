class Solution {
    public int[] separateDigits(int[] nums) {
        String s = Arrays.toString( nums );
      List<Integer> ans = new ArrayList<>();

        for( char c : s.toCharArray() ){

            if( c == '[' || c == ']' || c == ',' || Character.isWhitespace( c ) ) continue;

            ans.add( Character.getNumericValue( c ) );

        }

   

        int a [] = new int[ ans.size() ];

        for( int i = 0 ; i < ans.size() ; i++ ){

            a[i] = ans.get(i);

        }


        return a;  
    }
}