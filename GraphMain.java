package com.graph_using_adjacency_matrix.main;

import com.graph_using_adjacency_matrix.graph.Graph;

public class GraphMain {

	public static void main(String[] args) 
	{
		 Graph graph = new Graph(5);
	     
		 graph.addEdge(0, 2);
	     graph.addEdge(1, 4);
	     graph.addEdge(1, 3);
	     graph.addEdge(0, 1);
	     graph.addEdge(1, 4);
	     graph.addEdge(0, 2);
	     graph.addEdge(3, 0);
	     graph.printGraph();
	}

}
