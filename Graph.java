package com.graph_using_adjacency_matrix.graph;
 
  public class Graph 
   {
	  
		private final int vertices;
	    
		private int[][] adjacencyMatrix;

	    public Graph(int vertices) 
	    {
	        this.vertices = vertices;
	        adjacencyMatrix = new int[vertices][vertices];
	    }

	    public void addEdge(int source, int destination) 
	    {
	        adjacencyMatrix[source][destination] = 1;
	    }

	    public void printGraph() 
	    {
	        System.out.println("Graph represented using adjacency matrix:");
	        for (int i = 0; i < vertices; i++) 
	        {
	            for (int j = 0; j < vertices; j++) 
	            {
	                System.out.print(adjacencyMatrix[i][j] + " ");
	            }
	          System.out.println();
	        }
	    }
}

