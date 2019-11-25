package lab.stack;

import lab.linkedlist.*;

public class Stack 
{
	

LinkedList stackList;

public Stack()
{
	stackList=new LinkedList();
	stackList.headnode=null;
	
}

	public void push(Object data)
	{
		
    stackList.insertBegining(data);	 	
		
	}
	
	public Object pop()
	{
		return stackList.getFirstinList();
	}
	
	
	
	
	
}
