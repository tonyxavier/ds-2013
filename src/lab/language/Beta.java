package lab.language;

public class Beta extends Alpha {
	
	
	public static void main(String args[])
	{
		Beta beta=new Beta();
		Alpha alpha=new Alpha();
		beta.g=10;
		
		
		System.out.println("Value of Sub is "+beta.g);
		System.out.println("Value of super is" + alpha.g);
		alpha.g=15;
		System.out.println("Value of Sub is "+beta.g);
	}

}
