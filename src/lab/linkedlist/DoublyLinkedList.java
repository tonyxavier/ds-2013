package lab.linkedlist;

public class DoublyLinkedList 
{
	
	public DoublyLinkedListNode headnode;
	public DoublyLinkedListNode currentNode;
	public DoublyLinkedListNode lastnode;


	public DoublyLinkedList ()
	{
	headnode=null;  	
	currentNode=null;
	lastnode=null;
	}

	public DoublyLinkedListNode getListHead()
	{
		return headnode;
	}


	public void insertBegining(Object info)
	{
	DoublyLinkedListNode tmpnode=new DoublyLinkedListNode();
	tmpnode.data=info;
	if(headnode==null)
	{
	tmpnode.left=null;
	tmpnode.right=null;
	lastnode=tmpnode;
	}
	else
	{
	tmpnode.right=headnode;
	tmpnode.left=null;
	}
	headnode=tmpnode;	
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
	headnode=headnode.right;
	headnode.left=null;	
	}
	else
	{
		return;
	}
	
}
}
