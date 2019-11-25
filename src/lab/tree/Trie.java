package lab.tree;

import java.util.Vector;

public class Trie
{
	TrieNode triehead;
	final int MAX_LIST_SIZE=50;
	Vector<String> wordlist;
	
	public Trie()
	{
     triehead=null;		
	}
	
	public void add(String word)
	{
		TrieNode temp1,temp2;
		int wordlen=word.length();
		
		char[] wordarray=word.toCharArray();
		
		if(triehead==null)	
			triehead=new TrieNode();
			
	temp1=triehead;
	
	int i=0;
	int indx;
	
		
	while(i<wordlen)
	{ 
		indx=Mapping.getIndexForChar(wordarray[i]);
		temp2=temp1;
		temp1=temp1.childArray[indx];
		
		if(temp1==null)
		{
			temp1=new TrieNode();
			temp2.childArray[indx]=temp1;
			
		}
		
		if(i==wordlen-1)//To add last character in the word
		{
			temp1.endOfWord=true;	
			temp1.word=word;
		}
		
		
		i++;
	}
		
		
	}
	
	public boolean checkIfExists(String word)
	{
		if(triehead==null)
			return false;
		
		int i=0;
		char[] wordchars=word.toCharArray();
		
		while(i<wordchars.length)
		{
			
		}
		
		
		return false;
	}
	
	public String[] findAllWithPrefix(String prefix)
	{
		String[] names=new String[MAX_LIST_SIZE];
		
		
		return names;
	}
	
	public void getAllWords(TrieNode root)
	{
		if(root!=null)
		{
           
			if(root.endOfWord)
				wordlist.add(root.word);
				
				
				
			int i=0;
			while(i<root.NUM_OF_CHILDREN)
			{
				if(root.childArray[i]!=null)
				{
					getAllWords(root.childArray[i]);
				}
				
			}
			
		}
		
	}
	
	

}
