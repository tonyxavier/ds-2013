package lab.linkedlist;

import lab.general.*;

public class LinkedList 
{

public ListNode headnode;
public ListNode currentNode;
public ListNode lastnode;
int nodeCount;


public LinkedList()
{
headnode=null;  	
currentNode=null;
lastnode=null;
nodeCount=0;
}

public ListNode getListHead()
{
	return headnode;
}


public void insertBegining(Object info)
{
ListNode tmpnode=new ListNode();
tmpnode.data=info;
if(headnode==null)
{
tmpnode.nextnode=null;
lastnode=tmpnode;
}
else
{
tmpnode.nextnode=headnode;	
}
headnode=tmpnode;	
nodeCount++;
}



public Object getFirstinList()
{
	if (headnode!=null)
	{
	return headnode.data;
	}
	else
	{
		return null;
	}
}


public void deleteFirstInList()
{
if(headnode!=null)
{
headnode=headnode.nextnode;
nodeCount--;
}
else
{
	return;
}
	
}



public Object getNextNode()
{
	ListNode temp=currentNode;
	if(currentNode==null)
	{return null;} 
	else{
		currentNode=currentNode.nextnode;
    	return temp.data ;
	    }
}
	
public void startIterator()
{
	currentNode=headnode;
}

public void insertEnd(Object info)
{
ListNode tmpnode=new ListNode();
tmpnode.data=info;
if(headnode==null)
{
headnode=tmpnode;
}
else
{
lastnode.nextnode=tmpnode;
}
tmpnode.nextnode=null;
lastnode=tmpnode;	

nodeCount++;
}

public Object search(Object o)
{
	ListNode temp;
	temp=headnode;
	KeyCompare key1=(KeyCompare)o;
	KeyCompare key2;
	while(temp!=null)
	{
	 key2=(KeyCompare)temp.data;
	 if(key2.compareKey(key1))
		{
			return temp.data;
		}
	 temp=temp.nextnode;
			
	}
	return null;
	
}


public void reverseList()
{
	ListNode temp1,temp2,temp3;
	
	temp1=headnode;
	temp2=headnode.nextnode;
	temp3=null;
	headnode.nextnode=null;
	while(temp2.nextnode!=null)
	{
		temp3=temp2.nextnode;
		temp2.nextnode=temp1;
		temp1=temp2;
		temp2=temp3;
	}
	temp2.nextnode=temp1;
	headnode=temp2;
	
}


public Object getNthFromLast(int n)
{
 if(n<1)
	  return null;
 if(n>nodeCount)
	  return null;
 ListNode temp1,temp2;
 temp1=this.headnode;
 temp2=this.headnode;
 int i=1;
 while(i<n)
 {
	 i++;
	 temp1=temp1.nextnode;
 }
 
 while(temp1.nextnode!=null)
 {
	 temp1=temp1.nextnode;
	 temp2=temp2.nextnode;
 }
 
 return temp2.data;
	
}



}

