class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list=new ArrayList<>();
        int c=0;
        for(int i=1;i<=n;i++){
if(c==target.length){
break;
}
        list.add("Push");
            if(target[c++]!=i){
                list.add("Pop");
                c--;
            }
        }
        return list;
    }
}

