package lab.tree;

public class TrieNode 
{
	String word;
	boolean endOfWord;
	Object data;
	TrieNode[] childArray;
	TrieNode parent;
	int numOfChildren;
	public final int NUM_OF_CHILDREN=36;
	
	public TrieNode()
	{
		childArray=new TrieNode[NUM_OF_CHILDREN];
		endOfWord=false;
		numOfChildren=0;
	}
	
	
	
		
}
