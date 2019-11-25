package lab.graph;

import java.util.ArrayList;

/* For directed graph, The adjacency matrix A[i,j] is 1 if there's 
 path from i-->j and A[j][i] 1 if there's a path from j-->i*/  


public class Graph {
	private final int SIZE=20;
	private int[][] adjascency_matrix;
	String [] node_names=new String [SIZE]; 
	
	public Graph(int SIZE)
	{
		adjascency_matrix =new int[SIZE][SIZE];
	}
	
	public Graph()
	{
		adjascency_matrix =new int[SIZE][SIZE];
	}
	
	public void updateGraph(int i,int j,int weight)
	{
		adjascency_matrix[i][j]=weight;
	}
	
	public boolean isConnected(int i,int j)
	{
		if(adjascency_matrix[i][j]!=0)
			return true;
		else
			return false;
	}
	
	public ArrayList<Integer> getNeighbours(int i)
	{
	  ArrayList<Integer> listOfNeighbours=new ArrayList<Integer>();
	  
			  for(int j=0;j<SIZE;j++)
			    if(adjascency_matrix[i][j]!=0)
			    	listOfNeighbours.add(j);			  
			  
			  return listOfNeighbours;		
	}
	
	
	public ArrayList<Integer> getShortestPath(int i,int j)
	{
		ArrayList<Integer> pathList =new ArrayList<Integer>();
		
		return pathList;
		
	}
	
	public Graph getSpanningTree()
	{
		Graph graph =new Graph();
		
		return graph;
	}
	
	public Graph getMinimumSpanningTree()
	{
		Graph graph =new Graph();
		
		return graph;
	}
	
	public Graph getHamiltonianPath()
	{
		Graph graph =new Graph();
		
		return graph;
	}
	
	public static void main(String args[])
	{
	  Graph graph =new Graph(7);
	  
	  graph.updateGraph(0, 1, 3);
	  graph.updateGraph(0, 3, 4);
	  graph.updateGraph(1, 5, 7);
	  graph.updateGraph(3, 2, 7);
	  graph.updateGraph(4, 0, 4);
	  graph.updateGraph(4, 5, 25);
	  graph.updateGraph(5, 6, 3);
	  graph.updateGraph(6, 4, 6);
	  
	  System.out.println("End");
	}
	

}
