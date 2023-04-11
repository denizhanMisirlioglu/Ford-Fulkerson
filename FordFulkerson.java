import java.util.HashMap;
//https://steemit.com/programming/@drifter1/programming-java-graph-maximum-flow-algorithm-ford-fulkerson
public class FordFulkerson {
	
	 public static int FordFulkerson(Graph g, int source, int dest, HashMap map) {
	        // error proof
	    	 
	        if (source == dest) {  
	            return 0;
	        }
	        int V = g.getvCount();
	 
	        // create residual graph
	        Graph rg = new Graph(V);
	        for (int i = 0; i < V; i++) {
	            for (int j = 0; j < V; j++) {
	                rg.getAdj()[i][j] = g.getAdj()[i][j];
	            }
	        }
	 
	        // filled by BFS to store path
	        int parent[] = new int[V];
	   
	        int max_flow = 0; // max flow value
	 
	        // while a path exists from source to dest loop
	        while (bfs.bfs(rg, source, dest, parent)) {
	            // to store path flow
	            int path_flow = Integer.MAX_VALUE;
	 
	            // find maximum flow of path filled by bfs
	            for (int i = dest; i != source; i = parent[i]) {
	            	
	                int j = parent[i];
	              
	                path_flow = Math.min(path_flow, rg.getAdj()[j][i]);
	               
	                             
	               
	            }
	            
	            for(int i = dest ; i != source; i = parent[i]) {
	            
	            	int j = parent[i];
	            
	            if( j != source &&  path_flow == rg.getAdj()[j][i]) {	    // printing potential blocking edges with number representations       		            		            		            	
	            		            	                                    // could not print string key using value number  with hashmap
	            	         System.out.println("potential blocking flow edge : " + j + " -> "+i);         
	            	        
	            		            	
	                        }
	                   }                 	           
	                      	          
	 
	            // update residual graph capacities
	            // reverse edges along the path
	            for (int i = dest; i != source; i = parent[i]) {
	                int j = parent[i];
	                rg.getAdj()[j][i] -= path_flow;
	                rg.getAdj()[i][j] += path_flow;
	            }
	 
	            // Add path flow to max flow
	            max_flow += path_flow;
	        }
	 
	        return max_flow;
	    }
	  
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
