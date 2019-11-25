package lab.collections;

import java.util.*;
import lab.general.*;

public class SetExample 
{
	
	public static void main(String params[])
	{
		Iterator<CustomerInfo> iterator;
		CustomerInfo cust;
		
	    HashSet<CustomerInfo> hashset= new HashSet<CustomerInfo>();
		TreeSet<CustomerInfo> treeset = new TreeSet<CustomerInfo>();
		LinkedHashSet<CustomerInfo> linkedhashset= new LinkedHashSet<CustomerInfo>();
		
		hashset.add(new CustomerInfo("Biresh",4));
		hashset.add(new CustomerInfo("Kartik",2));
		hashset.add(new CustomerInfo("Akshay",3));
		hashset.add(new CustomerInfo("Katrina",3));
		
		
		treeset.add(new CustomerInfo("Biresh",14));
		treeset.add(new CustomerInfo("Kartik",12));
		treeset.add(new CustomerInfo("Akshay",13));
		treeset.add(new CustomerInfo("Katrina",13));
		
		
		linkedhashset.add(new CustomerInfo("Biresh",24));
		linkedhashset.add(new CustomerInfo("Kartik",22));
		linkedhashset.add(new CustomerInfo("Akshay",23));
		linkedhashset.add(new CustomerInfo("Katrina",23));
		
 System.out.println("From HashSet...");		
		iterator=hashset.iterator();
		
		while(iterator.hasNext())
		{
			cust=iterator.next();
			cust.process();
		}
		

System.out.println("From TreeSet...");
        iterator=treeset.iterator();
		
		while(iterator.hasNext())
		{
			cust=iterator.next();
			cust.process();
		}
		
System.out.println("From LinkedHashSet...");		
        iterator=linkedhashset.iterator();
		
		while(iterator.hasNext())
		{
			cust=iterator.next();
			cust.process();
		}
		
		
	}

}
