package lab.utils;

import lab.tree.Mapping;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class AddressBook 
{
	Vector<Contact> contactlist=new Vector<Contact>();
	LinkedHashMap<String,Contact> searchList=new LinkedHashMap<String,Contact>();
	
	
public void add(String name,String number)
{   String firstname,secondname;
	StringTokenizer st=new StringTokenizer(name);
    firstname=st.nextToken();
    secondname=st.nextToken();
    
    Contact temp=new Contact();
    
    temp.firstname=firstname.toLowerCase();
    temp.lastname=secondname.toLowerCase();
    temp.number=number;
    contactlist.add(temp);  	 
	
}

public void filterSearchList(char[] chars,int pos)
{
	Contact temp;
	Vector<String> numbersToDelete=new Vector<String>();
	int i=0;
	boolean remove=false;
    Collection<Contact> searchedContacts;	
	searchedContacts=searchList.values();
	Iterator<Contact> iterator=searchedContacts.iterator();
	while(iterator.hasNext())
	{
		 remove=true;
		 temp=iterator.next();
		 if(temp.SRCH.equals("ALL"))
		 {
			 i=0;
		 while(i<chars.length)
		 {
			 if(temp.firstname.charAt(pos)==chars[i] || temp.lastname.charAt(pos)==chars[i] || temp.number.charAt(pos)==chars[i])
				 remove=false;
			i++;
		 }
			 
		 }
		 else if(temp.SRCH.equals("BOTH"))
		 {
			 i=0;
		 while(i<chars.length)
		 {
			 if(temp.firstname.charAt(pos)==chars[i] || temp.lastname.charAt(pos)==chars[i])
				 remove=false;
			i++;
		 }
			 
		 }
		 else if(temp.SRCH.equals("FN"))
		 {
			 i=0;
		 while(i<chars.length)
		 {
			 if(temp.firstname.charAt(pos)==chars[i])
				 remove=false;
			i++;
		 }
			 
		 }
		 else if(temp.SRCH.equals("LN"))
		 {
			 i=0;
		 while(i<chars.length)
		 {
			 if(temp.lastname.charAt(pos)==chars[i])
				 remove=false;
			i++;
		 }
			 
		 }
		 else if(temp.SRCH.equals("NUM"))
		 {
			 i=0;
		 while(i<chars.length)
		 {
			 if(temp.number.charAt(pos)==chars[i])
				 remove=false;
			i++;
		 }			 
		 }		 
	
		  if(remove)
		    {
			    numbersToDelete.add(temp.number);		    
		    }		
	    }
	i=0;
	while(i<numbersToDelete.size())
	   searchList.remove(numbersToDelete.elementAt(i++));
	
}

public void searchContacts(String prefix)
{
	Contact temp;
	boolean FN,LN,BOTH,ALL,NUM;
	int i=0;
	while(i<contactlist.size())
	{
		temp=contactlist.elementAt(i);
		
		FN=temp.firstname.substring(0,prefix.length()).equals(prefix);
		LN=temp.lastname.substring(0,prefix.length()).equals(prefix);
		NUM=temp.number.substring(0,prefix.length()).equals(prefix);
		BOTH=FN && LN;
		ALL=FN && LN && NUM;
		
		if(FN)
		{
			temp.SRCH="FN";
			searchList.put(temp.number,temp);
		}
		else if(LN)
		{
			temp.SRCH="LN";
			searchList.put(temp.number,temp);	
		}
		else if(NUM)
		{
			temp.SRCH="NUM";
			searchList.put(temp.number,temp);	
		}
		
		if(BOTH)
			temp.SRCH="BOTH";
		
		if(ALL)
			temp.SRCH="ALL";	
		
	
	i++;	
	}
	
}

public void buildSearchList(int n,int pos)
{
//	searchList.clear();
	char[] chars=Mapping.getCharsforNumber(n);
	if(pos==0)
	{
	for(int i=0;i<chars.length;i++)
	{
		searchContacts(String.valueOf(chars[i]));	
	}
	}
	if(pos>0)
	{
		filterSearchList(chars,pos);
	}
	
}
	
public static void main(String args[])
{
	AddressBook addressbook=new AddressBook();
	addressbook.add("Tony Braxton", "9960287780");
	addressbook.add("Trojan Tomas", "1960287780");
	addressbook.add("Robin Uthappa", "7960285880");
	addressbook.add("Somy Baba", "8970287880");
	addressbook.add("Ajith Togi", "160287880");
	addressbook.add("Tony Braxton", "123456789");
	addressbook.add("Biju Patnaik", "245678902");
	addressbook.add("Vivek Shah", "545678902");
	addressbook.add("Ambani Anil", "775678902");
	
addressbook.searchList.clear();
	addressbook.buildSearchList(8,0);
	addressbook.buildSearchList(6,1);
	addressbook.buildSearchList(6,2);
	addressbook.buildSearchList(9,3);

	
addressbook.searchList.clear();
//	addressbook.buildSearchList(9,0);
//	addressbook.buildSearchList(9,1);
//	addressbook.buildSearchList(6,2);
//	addressbook.buildSearchList(0,3);
//	addressbook.buildSearchList(2,4);


addressbook.searchList.clear();
	addressbook.buildSearchList(7,0);
	addressbook.buildSearchList(6,1);
	addressbook.buildSearchList(6,2);
	
	
	Collection<Contact> searchedContacts;
	
	searchedContacts=addressbook.searchList.values();
	Iterator<Contact> iterator=searchedContacts.iterator();
	Contact temp;
	while(iterator.hasNext())
	{
		temp=iterator.next();
		temp.show();
				
	}
	
	
	
	
}


}
