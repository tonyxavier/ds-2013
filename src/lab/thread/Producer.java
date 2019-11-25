package lab.thread;

public class Producer extends Thread {
	
	Queue q;
	int id;
	static int p=1;
	
public	Producer(Queue qu,int sn)
	{
		q=qu;
		id=sn;
		this.start();		
	}
	
	public void run()
	{
		
		while(p<100)
		{
			q.put(p++,id);
			
		}
	}

	
}
