package lab.queue;

import lab.linkedlist.*;

public class Queue {

private LinkedList queuelist;	

public Queue()
{
queuelist=null;	
}


public void enqueue(Object info)
{

  if(queuelist==null)
   {
	queuelist=new LinkedList();
	queuelist.insertEnd(info);
   }
  else
  {	
	queuelist.insertEnd(info);
  }

}

public Object dequeue()
{

	if(queuelist==null)
	{
		return null;
	}
	else
	{
		Object tmp=new Object();
		tmp=queuelist.getFirstinList();
		queuelist.deleteFirstInList();
		return tmp; 
	}
	
}


}
