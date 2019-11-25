package lab.puzzles;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Random;

public class Puzzles {
	public static int count=0; 
	final int X=30;

	
	class Inner1{
		int k;
		
		public void printer()
		{
			System.out.println("Testing");
		}
	}
	
public boolean isDivisibleBy3(int num)
{
//Find if a number is divisible by 3 without using / or % operator
	class Tester{
		int i;
	}
	
	Inner1 inn=new Inner1();
	
	inn.k=70;
	
	Tester tst=new Tester();
	
	tst.i=34;
	
	
	int sum=0;
	String strnum=(new Integer(num)).toString();
	if(num<10){
		sum=num;
	}
	
	while(strnum.length()>=2)
	{
    sum=0;		
	for(int i=0;i<strnum.length();i++)
	{
 sum=sum+ Integer.parseInt(strnum.substring(i,i+1));
	}
	if(sum>=10)
	{
		strnum=(new Integer(sum)).toString();
	}
	else
	{
	  break;	
	}
	
	}
	
	if(sum==3 || sum==6 || sum==9)
	{
		return true;
	}
	else
	{
		return false;
	}
}

public void passTest(StringBuffer b)
{
	b.append("Test");
	
}


public int logpower(int x,int m)
{
//Calculates x^m in O(log m) time
	
	if(m==1)
	return x;
	else if(m%2!=0)
	return logpower(x,m/2)*logpower(x,m/2)*x;
	else
	return logpower(x,m/2)*logpower(x,m/2);
}

public int[] deduplicate(int[] numbers,int N)
{	
	//Number from 1 to N are stored in an array of size N
	//De-duplicate the array without using extra space.
	//Algo should be O(n)
	int val=0;
	
	for(int i=1;i<=N;i++)
	{
		val=Math.abs(numbers[i]);
//The fact that a number X appeared once - is represented by
//changing the sign of the value at arr[X].
//So if arr[X] is -ve that means X has already been seen.

		if(numbers[val]>0)
			numbers[val]=numbers[val]*-1;
		else 
		{
			numbers[i]=N+1;
		}
			
		
	}
	return numbers;
	
}

public int reverseFactorial(int fact)
{
	int sum=1;
	int i=1;
	while(sum<fact)
	{
	  i++;
	  
	  sum=sum*i;
	}  
	  
	if(sum==fact)
	{
		return i;
	}
	else
	{
		return -1;
	}
	

}


public void  shuffle()
{
  int[] cards =new int[52];
  
  Random random =new Random();
  
  random.setSeed(new Date().getTime());
  
  for(int i=0,j=0;i<52;i++,j++)
  {
	  cards[i]=j;
	  System.out.println(j);
  }
  
  for(int i=0,j=0,t=0,k=0;i<52;i++)
  {
	  j=random.nextInt(52);
//	  k=random.nextInt(52);
	  t=cards[j];
//	  cards[j]=cards[k];
//	  cards[k]=t;
	  cards[j]=cards[i];
	  cards[i]=t;
 
  }
  
  for(int i=0;i<52;i++)
  {
  System.out.println(cards[i] + ", "+i);
  }
	
}


public void arrayIntersection()
{
//To find the intersection of 2 arrays  
	HashSet<Integer> hashsetA = new HashSet<Integer>();
	HashSet<Integer> hashsetB = new HashSet<Integer>();
	int[] inputA={1,2,3,4,5,6,7,8,9,10};
	int[] inputB={5,6,5,12,13,14};
	
	for(int i=0;i<10;i++)
	{
		hashsetA.add(inputA[i]);
	}
	
	for(int i=0;i<5;i++)
	{
		hashsetB.add(inputB[i]);
	}
	
	Iterator<Integer> iterator;
	iterator=hashsetB.iterator();
	
	int i;
	while(iterator.hasNext())
	{
		i=iterator.next();
		if(hashsetA.contains(i))
		{
			System.out.println(i);
		}
	}
	
}


public void findDuplicatesInArray()
{
// Find duplicate elements in an array O(n)
	
   Hashtable<Integer,Integer> hashtable=new Hashtable<Integer,Integer>();
   int [] inputA={1,2,2,3,4,5,5,6,7};
   
   for(int i=0;i<9;i++)
   {
     if(hashtable.put(inputA[i], inputA[i])!=null)
     {
    	 System.out.println("Duplicate:"+inputA[i]);
     }
   }
   
   
	
}


public int setBitCount(int n)
{
//Count the number of bits which are 1	
	
	int count=0;
	
	while(n!=0)
	{
	if((n&1)>0)
	{
		count++;
	}
	n=n>>>1;
	}
	return count;
	
}

public void copyArray()
{
	int [] srcArr={1,2,3,4,5,6,7};
	int [] desArr=new int[4];
	
	System.arraycopy(srcArr, 2, desArr, 0, 4);
	
	for(int i=0;i<4;i++)
	{
		System.out.println("Copied: "+desArr[i]);
	}
	
	
}

	



public int kthSmallestOfUnion(int[]a,int[]b,int k)
{
	int lowa,lowb,mida,midb,higha,highb;
	
	if(a.length==0 || b.length==0)
		return -1;
	
	
	
			
	
	if(k==1)
		return (a[0]<b[0])? a[0]:b[0];
	
	if(k>(a.length+b.length) ||k<1)
		return -1;
	
	if(k<=b.length && a[0]>b[k-1] )		
		return b[k-1];
	else if(k<=a.length && b[0]>a[k-1])
		return a[k-1];
	
	
	if(k<a.length)
	    higha=k-1;
	else
	   higha=a.length-1;
	
	if(k<b.length)
	    highb=k-1;
	else
	   highb=b.length-1;
	
	mida=higha/2;
	midb=highb/2;
	
	lowa=0;
	lowb=0;

int n=0,anext=mida+1,bnext=midb+1;

	while(n!=k  || (a[anext]<b[midb]&&anext!=higha) ||(b[bnext]<a[mida]&& bnext!=highb))
	{	
	
	n=mida+midb+2;	
	 //To avoid Null pointer exception		
	if(mida+1>=a.length)
		anext=mida;
	else
		anext=mida+1;
	
	if(midb+1>=b.length)
		bnext=midb;
	else
		bnext=midb+1;
	
    if(n<k)
    {
		if(a[mida]>b[midb])
		{	
			lowb=midb;
			midb=(((midb+highb)/2)==midb)?highb:(midb+highb)/2;			
		}
		else if(a[mida]<=b[midb])
		{	
			lowa=mida;
			midb=(mida==higha)? (((midb+highb)/2)==midb)?highb:(midb+highb)/2 :midb;
			mida=(((mida+higha)/2)==mida)?higha:(mida+higha)/2;	
			
		}
	}
    else if(n>k)
    {
    	if(a[mida]>b[midb])
		{	
    		higha=mida;
    		mida=(mida+lowa)/2;			
		}
		else if(a[mida]<=b[midb])
		{			
			highb=midb;
			midb=(midb+lowb)/2;			
		}    	
    }
    else
    {
    	if(a[anext]<b[midb] && anext!=higha) //There's one more element in a to be considered 
    	{
    		mida=(((mida+higha)/2)==mida)?higha:(mida+higha)/2;	
    		midb=midb=(midb+lowb)/2;		
    	}
    	if(b[bnext]<a[mida] && bnext!=highb )
    	{
    		midb=(((midb+highb)/2)==midb)?highb:(midb+highb)/2;			
    		mida=(mida+lowa)/2;		
    	}
    }
    
    n=mida+midb+2;
    
  //To avoid Null pointer exception		
	if(mida+1>=a.length)
		anext=mida;
	else
		anext=mida+1;
	
	if(midb+1>=b.length)
		bnext=midb;
	else
		bnext=midb+1;

    
	}
	
	if(a[mida]>b[midb])
	  return a[mida];
	else
	  return b[midb];
	
}

public int binarySearch(int[]a,int key)
{
	int low,mid,high;
	
	low=0;
	high=a.length;
	mid=high/2;
	
	while(low<=high)
	{
	if(a[mid]>key)
	{
		high=mid-1;
		mid=(low+high)/2;
	}
	else if(a[mid]<key)
	{
		low=mid+1;
		mid=(low+high)/2;
	}
	else
		return mid;
	}
	
	return -1;
	
	
}


public int[] reverseArray(int[]a, int i, int j)
{ 	//To reverse elements from i to j (0 to n-1)
	int temp=0;
	while(i<j)
	{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
	}
	return a;
	
}




public boolean isPowerOf2(int num)
{
	if((num&(num-1))==0 && num>0)
		return true;
	else
		return false;
}

//To get nth fibonacci number
public int recursiveFibonacci(int n)
{ 
	
  System.out.println("Count:"+count++);	 
  
	if(n==1||n==2)
		return 1;
	
	return (recursiveFibonacci(n-1) + recursiveFibonacci(n-2));
}


public static void allValidBrackets(int n, int open, int closed, String str) {
 
        if (closed == n) {
            System.out.println(str);
            return;
        }
 
        if (open < n) {
        	allValidBrackets(n, open+1, closed, str + "{");
        }
 
        if (closed < open) {
        	allValidBrackets(n, open, closed+1, str + "}");
        }
}

public void arrayTest(int[] a)
{
	int[] c=new int[a.length];
	int[] d;
	c=a;
	d=a;	

	d[5]=99;
	System.out.println("From method");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(d[i]);
	}
	System.out.println("End of method");
}

public int[] group012(int[]arr)
{
	int low=0,mid=0,hi=arr.length-1,temp=0;
	
	while(mid<=hi)
	{
//low will point to first element from left which is not 0
//hi will point to first element from right which is not 2
//low will not point to 2, except when low==mid
//mid will move from 0 to hi and if it is 2, moves it to hi
//and if it is 1 moves it to low.		
		
	 switch(arr[mid])
	 {
	 case 0:
		 arr[mid++]=arr[low];
		 arr[low++]=0;
		 break;
	 case 1:
		  mid++;
		  break;
	 case 2:
		  arr[mid]=arr[hi];
		  arr[hi--]=2;		    
	 }
		
	}		
		
		return arr;				
}
	
	

public void swap(int[]arr,int i,int j)
{
	int temp;
	temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;	
}


public void printArray(int[]arr)
{
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}

public void idtest()
{
	int a=10,_____,b=5;
	_____=a*b;
	System.out.println("Underscore:"+_____);
}

public void varargTest(int n,int...nums)
{
	int res=1;
	char c=199;
	int numbers[]=new int[10];
	final int x;
	
	
	
	for(int i=0;i<n;i++)
	{
	res=res*nums[i];
	}	
	
	System.out.println("Varargs result:"+res +" Char:"+c);
}


public static void main(String params[])
{
	int n=4230;
	int x=2;
	int m=11;
	int N=10;
	int [] arr={3,6,4,2,3,4,2,1,5,5,3};
	Puzzles puzzles=new Puzzles();
	if(puzzles.isDivisibleBy3(n))
	{
		System.out.println(n+"is divisible by 3");
	}
	else
	{
		System.out.println(n+"is not divisible by 3");
	}

	System.out.println(x+"^"+m+"is:"+puzzles.logpower(x,m));
	
	System.out.println("The distinct numbers are: ");
	
	arr=puzzles.deduplicate(arr, N);
	
	for(int i=1;i<=10;i++)
	{
		if(Math.abs(arr[i])<=N)
		System.out.print(Math.abs(arr[i])+" ");
	}
	
	int fact=120;
	n=puzzles.reverseFactorial(fact);
	if(n!=-1)
	{
		System.out.println("Fact "+fact+ "n is "+n);
	}
	else
	{
		System.out.println(fact+" is not a factorial");
	}
	
	//puzzles.shuffle();
	//puzzles.arrayIntersection();
	//puzzles.findDuplicatesInArray();
	
	n=-0;
	System.out.println("Number of bits in "+n+": "+puzzles.setBitCount(n));
	
	puzzles.copyArray();
	
	StringBuffer a=new StringBuffer("Pass");
	
	puzzles.passTest(a);
	
	System.out.println("Result is: "+a);
	
	System.out.println("Kth elements..");
	int[]arr1={0,5,9,57};
	int[]arr2={14,21,34,36,41,44,46,49,51};
	int k=12;
	
    int[] arr3={0,0,0,2,1,0,1,2,0,0,1,2,2};
		
	puzzles.group012(arr3);
	
    System.out.println("Group012");
    
    puzzles.printArray(arr3); 
    
    puzzles.idtest();
    puzzles.varargTest(5,2,4,9,6,7);
    
    float fl=12.3F;
	
    int oct=0777;
    
    int hex=0xDeadCafe;
    
    char c=(char)-6;
    
    System.out.println(c);
    
    int[][] myArr=new int[5][];
    
   // myArr[3]=new int[10];
  //  myArr[1][9]=8;
    
  //  int[] anon=new int[5]{1,2,3};
    
  //  anon=new int[] {1,2,3};
    
   int x1=14,x2=6,x3;
   
   assert(x1 > x2);
   
   x3=x1/x2; 
   
   System.out.println("X3: "+x3);
   
   System.out.println(Runtime.getRuntime().totalMemory());
   
   Object abc=null;
   
   String xyz=(String)abc;
   
   System.out.println("Stringed");
  
       
}




}

class Second
{
	public static void test()
	{
		System.out.println("Tested");
	}
}
