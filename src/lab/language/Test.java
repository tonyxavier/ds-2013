package lab.language;

public class Test {
	Integer i;
	int x,y;
	private String name;
	
	protected class TestInner
	{
		int i=9;
	}
	
	Test()
	{
		y=x+i;
	}
	
	Test(String name)
	{
		this.name=name;
	}
	
	public boolean equals(Test t)
	{
		
		return t.name.equals(this.name);
	}
	
	public static void main(String args[]) throws Exception
	{
		Parent parent=new Parent();
		Child child=new Child();
		Inherittable inh;
		inh=parent;
		System.out.println(inh.process(10));
		inh=child;
		System.out.println(inh.process(10));	
		Object obj=new Object();
		
		Child1 child1=new Child1();
		Child2 child2=new Child2();
		
		Comparable comp;
		//String str=new String("Tester");
		
		comp=(Comparable)parent; // Why?
		
	//	inh=(Inherittable)str; //Why ?
		
		child=(Child)parent; 
	//	child1=(Child1)child2; //Can't cast-unrelated classes
	
		 
		// Object ti =new TestInterface(){
		//	 public String toMyString(){return "testi";}};
		 
		 System.out.println(new TestInterface(){
			 public String toMyString(){return "testi";}});
		 
		 String str="456";
		 
		 str+=78;
		 
		 System.out.println(str);
		 
		 Beta beta=new Beta();
		 Alpha alpha=new Alpha();
		// alpha=beta;
		// beta=(Beta)alpha;
		 
		
		 inh=(Delta)beta;
		 inh=(Beta)(Alpha)beta;
		 inh=alpha;
		 Test test=new Test();
		 
		 test.mytesting();
	
		 test.finallyTesting(4);
		
		 
	}
	
	 public void mytesting()
	 {
		 label:
			 for(int i=0;i<5;i++)
			 { 
				 for(int j=0;j<4;j++)
				 { 
					 
					 System.out.println("I,J:"+i+","+j);
					 
					 if(i==4)
						 break label;
				 }
				 if(i==4)
				  break;
					 
			 }
	 System.out.println("Im out");
	 
		 
	 }
	 
	 
	 public void finallyTesting(int n)
	 {
		 if(n==0) //finally will NOT be executed
			 return;
		 
		 System.out.println("Nis:"+n);
		
			 if(n==1) //finally WILL  be executed
				 return;
			 
			  //Both catch & finally are executed
				
			 else //Finally is executed, catch is not
				 System.out.println("Other");
		 
		 
			
			 
			 
		 
	 }
	 

}
