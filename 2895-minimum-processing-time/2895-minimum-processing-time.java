class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(tasks);
        Collections.sort(processorTime);
        int dkk=tasks.size();
        int result=Integer.MIN_VALUE;
        
        for(int i=0;i<processorTime.size();i++){
            
            int k=processorTime.get(i);
            
            int x=Math.max(k+tasks.get(dkk-1),k+tasks.get(dkk-2));
            
            int y=Math.max(k+tasks.get(dkk-3),k+tasks.get(dkk-4));
            
            result=Math.max(result,Math.max(x,y));
            
            dkk-=4;
        }
        return result;
    }
}