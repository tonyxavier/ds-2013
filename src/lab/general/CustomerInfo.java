package lab.general;

import lab.hashing.Hashable;

public class CustomerInfo implements Comparable, Processable,KeyCompare,Hashable {

CustomerInfoKey key=new CustomerInfoKey ();
private int customer_id;
private String customer_name;

public CustomerInfo(String name, int id)
{
	customer_name=name;
	customer_id=id;
	key.setKey(id);
}
	
	
	public void show()	
	{
		System.out.println("Name is "+customer_name + "ID is :"+customer_id);
	}
	
	public int compareTo(Object toinfo)
	{
		CustomerInfo tmpinfo=(CustomerInfo)toinfo;
		if(customer_id<tmpinfo.customer_id)
		{
			return -1;
		}
		else if(customer_id>tmpinfo.customer_id)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public CustomerInfoKey getKey()
	{
		return key;
	}
	

	public void process()
	{
		System.out.println("CustomerID is:"+customer_id+"Name is :"+customer_name);
	}	
	
public boolean compareKey(Object o)
	{
		CustomerInfoKey key1=(CustomerInfoKey)o;
		CustomerInfoKey key2=getKey();
		
		if(key1.compareKey(key2))
		{
			return true;
		}
		else
		{
			return false;
		}
		 
	}

public int getHashCode()
{
	return this.getKey().getHashCode();
}


	
}
