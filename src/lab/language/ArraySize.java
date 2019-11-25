package lab.language;

public enum ArraySize {
	
	TINY(10),SMALL(25),MEDIUM(50),BIG(100),LARGE(500),HUGE(1000);
   
	ArraySize(int size)
	{
		this.size=size;
	}
	
	private int size;
	
	public int getSize()
	{
		return size;
	}
	
	public static void main(String args[])
	{
	    ArraySize sizes=ArraySize.HUGE;
		System.out.println("Enuming.."+ArraySize.MEDIUM);
		System.out.println("Enuming.."+sizes.getSize());
		
	}
}
