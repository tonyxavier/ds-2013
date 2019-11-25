package lab.collections;

import java.util.*;
public class ListExample {
	
public static void main(String args[])
{
		
	ArrayList<Integer>  list=new ArrayList<Integer>();
	for(int i=0;i<10;i++)
	{list.add(i);}
	
	for(int i=0;i<5;i++)
	{list.remove(i);}
	
	for(int i=0;i<list.size();i++)
	{System.out.println(list.get(i));}
	
	 System.out.println("Starting split");
	String appid1="469902342001002";
	String ppid="469902342";
	String appid2="469902342135";
	
	  String[] right=appid2.split(ppid);
	  System.out.println(right.length);
	  for(int i=0;i<right.length;i++)
	  {
		  System.out.println(right[i]);
	  }
	  String grp=right[1];
	  System.out.println("Grp "+grp);
	  String grpid="";
	  if(grp.length()==6)
	  {
		  grpid=grp.substring(3,6);
		  System.out.println("Grpid "+grpid);
	  }	 
	  else 
	  {		
		  grpid=grp.substring(grp.length()-1);  
		  System.out.println("Grpid "+grpid);
	  }
	
}
}
