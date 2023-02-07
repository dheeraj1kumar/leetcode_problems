class Solution {
    public boolean canBeEqual(int[] t, int[] a) {
        Arrays.sort(t);
        Arrays.sort(a);
        boolean b=Arrays.equals(t,a);
        return b;
    }
}