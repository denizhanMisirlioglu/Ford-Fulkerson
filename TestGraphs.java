import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

//https://steemit.com/programming/@drifter1/programming-java-graph-maximum-flow-algorithm-ford-fulkerson
public class TestGraphs {
	
	
	 public static void main(String[] args) {	     
	 
	        bfs BFS = new bfs();
	        FordFulkerson fs = new FordFulkerson();
	        
	    	ArrayList<String> nodeStrings = new ArrayList<>();			
			
			
			String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader("graph.txt"));   //  Unfortunately we read the txt twice, the first time we keep the nodes in the arraylist,
			while((line = br.readLine()) != null) {                               //  how many nodes will be required for the next steps of the code because
				
	             
	              String[] txtArray = line.split("	");	
	              
	              
	              if(nodeStrings.contains(txtArray[0])) {            	  
	              }            	  
	              else  {
	              nodeStrings.add(txtArray[0]);              
	              }
	              
	              if (nodeStrings.contains(txtArray[1])) {            	  
	              }
	              else {
	            	  nodeStrings.add(txtArray[1]);
	            	  }	             
	              
			}   
		     
			br.close();
		} catch(FileNotFoundException e) {
		    e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		   HashMap<String, Integer> enumeratedNodeStrings = new HashMap<String,Integer>();  // we use hashmap because we need integer values for each node string for our calculation code
		      for ( int i = 0; i<nodeStrings.size() ; i++) {
		    	  enumeratedNodeStrings.put(nodeStrings.get(i),i);
		    	  
		      }
		
		
		    
		      Scanner input = new Scanner(System.in);                 // taking source and sink from user and turning them into integers with using hashmap
		  	System.out.println("Enter source node string");       // because we use nodes as integers in code  since we also use them for creating array capacities
		  	
		  	String source = input.nextLine();		 	
		   
		if(enumeratedNodeStrings.containsKey(source))
		 {	
		 	
		 }
		else {
			System.out.println("SOURCE NOT FOUND , ENTER VALID DATA");   // input control
			} 		  			  	
		int Source = enumeratedNodeStrings.get(source);			
		
		  	
		  	System.out.println("Enter destination node string");
		  	
		  	String sink = input.nextLine();
		  	if(enumeratedNodeStrings.containsKey(sink))
			 {		
		  	 	  
			 }
			else {
				System.out.println("DESTINATION NOT FOUND , ENTER VALID DATA"); // input control
			}
		  	
		  	int Sink = enumeratedNodeStrings.get(sink); 	        

	    
	        
	        Graph g = new Graph(nodeStrings.size());    
	 
	      
	        
	    	String line2 = "";
	    	try {
	    		BufferedReader br = new BufferedReader(new FileReader("graph.txt"));     // here we read again and this time we can insert edge values to our graph array
	    		 
	    		while((line2 = br.readLine()) != null) {
	    			String[] txtArray2 = line2.split("	");
	    			int u = enumeratedNodeStrings.get(txtArray2[0]);
	    			int v = enumeratedNodeStrings.get(txtArray2[1]);
	    			
	    			int w = Integer.parseInt(txtArray2[2]);
	    			
	    			g.addEdge(u,v,w);		 				
	    				    						   		
	    	       	                 
	    		}    
	    		br.close();
	    	} catch(FileNotFoundException e) {
	    	    e.printStackTrace();
	    	}catch(IOException e) {
	    		e.printStackTrace();
	    	}			
	           	          	        
	       
	        
	      //  int flag = 0 ; 
	    	//while(flag == 0) { // what i wanna try to do is , i will 
	    		               //By increasing the weight of the edges by one by  which causes this potential flow block 
	    		               // and after increament (+1) i will call FordFulkerson function again so we can see if there is increament on maxFlow
	    		               // until there is no more increament on maxFlow i will apply this 
	    		              // so i can find which of these potential blocking edges are actually causes problem( part2  )  
	    		              // and with counter i can observe how many times increament effects maxFlow so i can also find how many times we should increase that edge( part3 )
	    		              // after all of these i will use hashmap again for  converting node numbers to node strings and display them
	    		   		
	    		
	    		
	    		System.out.println("maxFlow:" + fs.FordFulkerson(g,Source,Sink,enumeratedNodeStrings));	    		
	    		
	    		
	    	//	flag=1;
	   // 	}	        
	            
	        
	        
	        	    }   
	    
	    
	    
}	    
	    
	    


