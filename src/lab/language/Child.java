package lab.language;

//import java.io.*;

 public class Child extends Parent {
	 
	 int k;
		
	 public Child(int i)
	 {

	k=i;
	 }
	
	 public Child()
	 {
		// Child(5);
		 this(5);
		 k=0;
		
	 }
	
	public double process(int i) 
	{                           //Must Specify throws
		if(i<0)
		{
			;
			//Throwing exception Object
		}
		return 1;
		
	}
	
//Duplicate method -compile time error	
//	public Object process(int i)
//	{
//		return new Object();
//	}
	
	public String process2(int i) throws NegativeNumberException
	{                           //Must Specify throws
	
		super.teststatic();
		if(i<0)
		{
			throw new NegativeNumberException();
			//Throwing exception Object
		}
		System.out.println(i);
		return "Process2";
	}
	
	public Object teststatic(int k)
	{
		//super.process2(10); //Error can't use super in a static context
		Parent.teststatic();
		System.out.println("Static from child");
		return new Parent[5];
	}
	
	public Parent testOverride()
	{
		System.out.println("Return type is Void");
		Inherittable inh=new Parent();
		return new Parent();
	}

}
