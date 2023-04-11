import java.util.LinkedList;
//https://steemit.com/programming/@drifter1/programming-java-graph-maximum-flow-algorithm-ford-fulkerson
public class bfs {
	 public static boolean bfs(Graph rg, int source, int dest, int parent[]) {
	        // array to store visited vertices
	        boolean[] seen = new boolean[rg.getvCount()];
	        for (int i = 0; i < rg.getvCount(); i++)
	            seen[i] = false;
	 
	        LinkedList<Integer> q = new LinkedList<Integer>(); // queue-like
	 
	        // visit source
	        q.add(source);
	        seen[source] = true;
	        parent[source] = -1;
	 
	        // loop through all vertices
	        while (!q.isEmpty()) {
	            int i = q.poll();
	            // check neighbours of vertex i
	            for (Integer j : rg.neighbours(i)) {
	                // if not visited and positive value then visit
	                if ((seen[j] == false) && (rg.getAdj()[i][j] > 0)) {
	                    q.add(j);
	                    seen[j] = true;
	                    parent[j] = i;
	                }
	            }
	        }
	 
	        // return boolean that tells us if we ended up at the destination
	        return seen[dest];
	    	 
	    
	    } 
}
