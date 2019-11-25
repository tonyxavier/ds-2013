package lab.tree;

public class Mapping {
	
	public static int getIndexForChar(char c)
	{
		int intVal=c;
		
		if(intVal==32)
			return 0;
		else if(intVal>=48 && intVal<=57)
			return intVal-47;
		else if(intVal>=97 && intVal<=122)
			return intVal-86;
		else if(intVal>=65 && intVal<=90)
			return intVal-54;
		else
			return -1;
	}
	
	public static char[] getCharsforNumber(int n)
	{
		char[] chars=null;
		switch(n)
		{
		case 2: 
			chars=new char[4];
			  chars[0]='2';
			  chars[1]='a';
			  chars[2]='b';
			  chars[3]='c';
			  break;
		case 3:
			chars=new char[4];
			chars[0]='3';
			  chars[1]='d';
			  chars[2]='e';
			  chars[3]='f';
			  break;
		case 4:
			chars=new char[4];
			chars[0]='4';
			  chars[1]='g';
			  chars[2]='h';
			  chars[3]='i';
			  break;
		case 5:
			chars=new char[4];
			chars[0]='5';
			  chars[1]='j';
			  chars[2]='k';
			  chars[3]='l';
			  break;
		case 6:
			chars=new char[4];
			chars[0]='6';
			  chars[1]='m';
			  chars[2]='n';
			  chars[3]='o';
			  break;
		case 7:
			chars=new char[5];
			chars[0]='7';
			  chars[1]='p';
			  chars[2]='q';
			  chars[3]='r';
			  chars[4]='s';
			  break;
		case 8:
			chars=new char[4];
			chars[0]='8';
			  chars[1]='t';
			  chars[2]='u';
			  chars[3]='v';
			  break;
		case 9:
			chars=new char[5];
			chars[0]='9';
			  chars[1]='w';
			  chars[2]='x';
			  chars[3]='y';
			  chars[4]='z';
			  break;
		case 0:
			chars=new char[1];
			chars[0]='0';
		    break;
		case 1:
			chars=new char[1];
			chars[0]='1';
		    break;	  
		}
		return chars;
		
	}
	
	
}
