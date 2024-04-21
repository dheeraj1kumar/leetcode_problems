import java.util.*;

class Solution {
    
    boolean check(Map<Integer, List<Integer>> mp, int node, int dest, boolean[] visited) {
        if(node == dest)
            return true;
        
        if(visited[node])
            return false;
        
        visited[node] = true;
        for(int it : mp.get(node)) {
            if(check(mp, it, dest, visited))
                return true;
        }
        return false;
    }
    
    boolean validPath(int n, int[][] edges, int source, int destination) {
        
        if(source == destination)
            return true;
        
        Map<Integer, List<Integer>> mp = new HashMap<>();
        
        for(int[] vec : edges) {
            int u = vec[0];
            int v = vec[1];
            
            if (!mp.containsKey(u)) mp.put(u, new ArrayList<>());
            if (!mp.containsKey(v)) mp.put(v, new ArrayList<>());
            
            mp.get(u).add(v);
            mp.get(v).add(u);
        }
        
        boolean[] visited = new boolean[n];
        return check(mp, source, destination, visited);
    }
}
