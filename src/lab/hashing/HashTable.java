package lab.hashing;

import lab.linkedlist.*;

public class HashTable 
{
   final int INIT_SIZE=100;
   final int INCREMENT=100;
   int CURRENT_SIZE;
   int LOAD_FACTOR=0;
   LinkedList[] hashtable=new LinkedList[INIT_SIZE];
   
   public HashTable()
   {
	   CURRENT_SIZE=INIT_SIZE;
   }
   

	
   public void put(Object key,Object value)
   {
	   int index;
	   Hashable hashkey=(Hashable)key;
	   index=(Math.abs(hashkey.getHashCode()))%CURRENT_SIZE;
	   if(hashtable[index]==null)
	   {
		   LinkedList seperatechain=new LinkedList();
		   hashtable[index]=seperatechain;
		   seperatechain.insertBegining(value);
	   }
	   else
	   {
		   hashtable[index].insertBegining(value);
	   }
	   
   }
   
   
   public Object get(Object key)
   {
	   int index;
	   Hashable hashkey=(Hashable)key;
	   index=(Math.abs(hashkey.getHashCode()))%CURRENT_SIZE;
	
	   if(hashtable[index]==null)
	   {
		   return null;
	   }
	   else
	   {		   
		   return hashtable[index].search(key);
	   }
   }
	

}
