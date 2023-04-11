	
	
	import java.util.List;
	import java.util.ArrayList;
	 //https://steemit.com/programming/@drifter1/programming-java-graph-maximum-flow-algorithm-ford-fulkerson
	public class Graph {
	    private int vCount;
	    private int[][] adj;
	 
	    public int getvCount() {
	        return vCount;
	    }
	 
	    public int[][] getAdj() {
	        return adj;
	    }
	 
	    public Graph(int vCount) {
	        this.vCount = vCount;
	        adj = new int[vCount][vCount];
	        for (int i = 0; i < vCount; i++) {
	            for (int j = 0; j < vCount; j++) {
	                adj[i][j] = 0;
	            }
	        }
	    }
	    
	    
	    public void increaseEdge(int i, int j) {          // i will use these functions to +1 and -1 potential blocking edges then i will absorbe changes on maxflow
	    	                                              // so i can decide which edges causes real blocking (part2) and how much should i increase them ( part 3 )
	    	adj[i][j]++;
	    	
	    }
	    public void decreaseEdge(int i , int j) {         //   
	    	adj[i][j]--;
	    }   
	    
	    
	    
	    
	 
	    public void addEdge(int i, int j, int weight) {
	        adj[i][j] = weight;
	    }
	 
	    public void removeEdge(int i, int j) {
	        adj[i][j] = 0;
	    }
	 
	    public boolean hasEdge(int i, int j) {
	        if (adj[i][j] != 0) {
	            return true;
	        }
	        return false;
	    }
	 
	    public List<Integer> neighbours(int vertex) {
	        List<Integer> edges = new ArrayList<Integer>();
	        for (int i = 0; i < vCount; i++)
	            if (hasEdge(vertex, i))
	                edges.add(i);
	        return edges;
	    }
	 
	    public void printGraph() {
	        for (int i = 0; i < vCount; i++) {
	            List<Integer> edges = neighbours(i);
	            System.out.print(i + ": ");
	            for (int j = 0; j < edges.size(); j++) {
	                System.out.print(edges.get(j) + " ");
	            }
	            System.out.println();
	        }
	    }
	}

