package lab.collections;

import lab.general.*;
import java.util.*;

public class MapExample {

	public static void main(String params[])
	{
		HashMap<Integer,CustomerInfo> hashmap=new HashMap<Integer,CustomerInfo>();
		//HashMap is Map implementation
		
		hashmap.put(1, new CustomerInfo("Churchil",1));
		hashmap.put(4, new CustomerInfo("Arnold",4));
		hashmap.put(2, new CustomerInfo("Lincoln",2));
		
			
		Collection<CustomerInfo> collection;
		Iterator<CustomerInfo> iterator;
		CustomerInfo cust;
		
		collection=hashmap.values();
		iterator =collection.iterator();

		while(iterator.hasNext())
		{
			cust=iterator.next();
			cust.process();
		}
		
		
		TreeMap<Integer,CustomerInfo>  treemap= new TreeMap<Integer,CustomerInfo>();
		//TreeMap is SortedMap implementation
		
		treemap.put(4, new CustomerInfo("Socrates",4));
		treemap.put(2, new CustomerInfo("Plato",2));
		treemap.put(3, new CustomerInfo("Yuvraj",3));
		treemap.put(3, new CustomerInfo("Sachin",3));
		
	//	treemap.get(2).process();
			
		collection=treemap.values();
		iterator =collection.iterator();
		while(iterator.hasNext())
		{
			cust=iterator.next();
			cust.process();
		}
		
		
		
		LinkedHashMap<Integer,CustomerInfo> linkedhashmap=new LinkedHashMap<Integer,CustomerInfo>();
		//LinkedHashMap Maintains the insertion order
		
		linkedhashmap.put(4, new CustomerInfo("Amir",4));
		linkedhashmap.put(2, new CustomerInfo("Kartik",2));
		linkedhashmap.put(3, new CustomerInfo("Akshay",3));
		linkedhashmap.put(3, new CustomerInfo("Katrina",3));
		
		collection=linkedhashmap.values();
		iterator =collection.iterator();
		while(iterator.hasNext())
		{
			cust=iterator.next();
			cust.process();
		}
		
		
		
	}
}
