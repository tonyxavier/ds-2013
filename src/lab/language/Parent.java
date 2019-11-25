package lab.language;
import java.io.*;

 public class Parent  implements Inherittable {
	
	private int a;
	private String str;

	Parent()
	{
		a=0;
	}

	Parent(int i)
	{
		a=i;
	}
	
	synchronized public static void testsync()
	{
		
	}
	
	public double process(int i) throws NegativeNumberException
	{                           //Must Specify throws
		if(i<0)
		{
			throw new NegativeNumberException();
			//Throwing exception Object
		}
    return 1;
	}
	
//Duplicate method -compile time error	
//	public Object process(int i)
//	{
//		return new Object();
//	}
	
	public Object process2(int i) throws NegativeNumberException, IOException
	{                           //Must Specify throws
		if(i<0)
		{
			throw new NegativeNumberException();
			//Throwing exception Object
		}
		return null;
	}
	
	
	public static void teststatic()
	{
		System.out.println("Static from parent");
	}
	
	public Inherittable testOverride()
	{
		System.out.println("Return type is Void");
		Inherittable inh=new Parent();
		return inh;
	}
//	
//Exceptions and return type is not part of the method signature.
//	public int testOverride()
//	{
//		System.out.println("Return type is Void");
//	}

}
