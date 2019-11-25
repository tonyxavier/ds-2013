package lab.thread;

public class Queue {
	static int n;
	static boolean produced;
public Queue()
{
n=0;
produced=false;
}

synchronized public void get(int id)
{
	
	while(!produced)
	{    try{
		wait();
	       }catch(InterruptedException ie)
	       {
		      System.out.println("Caught Interrupted exception");
	        }
    }
	System.out.println("Got "+n +" By Consumer: "+id);
	produced=false;
	notifyAll();
	}
	
synchronized public void put(int val,int id)
{
	while(produced)
	{
		try{
			wait();
			}catch(InterruptedException ie)
			{
				System.out.println("Caught Interrupted exception");
			}
        
	}
	n=val;
	System.out.println("Put : "+n+ " By Producer: "+id);
	produced=true;
	notifyAll();
}
	

}
