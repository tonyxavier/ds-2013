package lab.language;

public class Alpha implements Inherittable {
	public int g;
	public double process(int i) throws NegativeNumberException
	{                           //Must Specify throws
		if(i<0)
		{
			throw new NegativeNumberException();
			//Throwing exception Object
		}
    return 1;
	}

}
