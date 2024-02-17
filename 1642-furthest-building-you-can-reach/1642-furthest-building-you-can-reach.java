class Solution {
    public int furthestBuilding(int[] h, int b, int l) {
    int k=h.length;
        PriorityQueue<Integer> nm=new PriorityQueue<>();
        for(int i=0;i<k-1;i++)
        {
            int p=h[i+1]-h[i];
            
            if(p>0)
                nm.add(p);
            if(l<nm.size())
                b-=nm.poll();
            if(b<0)
                return i;
        }
        return k-1;
    }
}