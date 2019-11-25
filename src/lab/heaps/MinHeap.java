package lab.heaps;

public class MinHeap 
{
  int MAX_SIZE=100;	
  int last_position; //last position which is empty
  Comparable[] heap=new Comparable[MAX_SIZE];	
  //left child:2n+1, Right child: 2n+2	
  
  public MinHeap()
  {
	  last_position=0;  
  }
  
  public void insert(Object o)
  {
    Comparable data=(Comparable)o;
    Comparable temp;
    int i=last_position;
    last_position++;
    heap[i]=data;
    int parent_i=getParentPosition(i);
    
    if(parent_i==-1)
    { // No more checks needed for first insertion, so return
    	return;
    }
    
    while(heap[parent_i].compareTo(heap[i])>0)
    {
    	temp=heap[i];
    	heap[i]=heap[parent_i];
    	heap[parent_i]=temp;
    	i=parent_i;
    	parent_i=getParentPosition(i);
    	 if(parent_i==-1)
    	    {//To avoid array out of bound exception 
    	    	return;
    	    }
    	
    }
    
   }
  
  public Object deleteMin()
  {
	  Object temp1=heap[0];
	  Comparable temp;
	  
	  if(last_position==0)
	  {
		  return null;
	  }
	  else if(last_position==1)
	  {
	      heap[0]=null;
	      return temp1;
	  }
	  
	  int i=last_position-1;
	  heap[0]=heap[i];
	  heap[i]=null;
	  i=0;
	
// If there exists a smaller child for i, then get it.	  
	  int next=getSmallerChild(i);
	  
	  while(next!=-1)
	  {   
// Go down the heap until you have no smaller child
		  temp=heap[i];
		  heap[i]=heap[next];
		  heap[next]=temp;
		  i=next;
		  next=getSmallerChild(i);  
	  }
	  
	  last_position--;
	  return temp1;
  
  }
  
  public Object getMin()
  {
	  return heap[0];
  }
  
  public int getLeftChildPosition(int i)
  {
 	return (2*i)+1; 
  }
  
  public int getRightChildPosition(int i)
  {
 	return (2*i)+2; 
  }

  public int getParentPosition(int i)
  {
	  if(i==0)
	  {
		  return -1;
	  }
	  else if(i%2!=0)
	  {
		  return (i/2);
	  }
	  else
	  {
		  return (i/2)-1;
	  }
 	
  }
  
  public int getSmallerChild(int i)
  {
//Returns the index of the smaller child, if any of the children are smaller	  
	 int left=getLeftChildPosition(i);
	 int right=getRightChildPosition(i);
	 
	 if(heap[left]==null && heap[right]==null)
	 {
		 return -1;
	 }
	 else if(heap[left]!=null && heap[right]==null)
	 {
		 if(heap[left].compareTo(heap[i])<0)
		    return left;
		 else
			 return -1;
	 }
	 else if(heap[left]!=null && heap[right]!=null)
	 {
		 if(heap[left].compareTo(heap[right])<0 && heap[left].compareTo(heap[i])<0)
		 {
			 return left;
		 }
		 else if(heap[left].compareTo(heap[right])>0 && heap[right].compareTo(heap[i])<0)
		 {
			 return right;
		 }
		 else
		 {
			 return -1;
		 }
	 }
	 
	 return -1;
	  
  }
	
	
}
