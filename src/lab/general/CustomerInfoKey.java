package lab.general;

import lab.hashing.Hashable;

public class CustomerInfoKey implements KeyCompare,Hashable
{
private int customer_id;


public CustomerInfoKey()
{
	
}

public CustomerInfoKey(int id)
{
	customer_id=id;	
}

public void setKey(int key)
{
	customer_id=key;
}


public boolean compareKey(Object o)
{
	CustomerInfoKey key=(CustomerInfoKey)o;
	if(key.customer_id==this.customer_id)
	  return true;
	else
	  return false;
}

public int getHashCode()
{
	return customer_id;
}

		
}


