class Solution {
    public List<Integer> findDuplicates(int[] a) {
        ArrayList l=new ArrayList<>();
        if(l.size()==1){
            l.add(null);
        }
        Set<Integer> s=new HashSet<>(l);
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                s.add(a[i]);
                continue;
            
      
            }
        }
        ArrayList li=new ArrayList<>(s);
        Collections.sort(li);
        
    
        return li;
    }
}