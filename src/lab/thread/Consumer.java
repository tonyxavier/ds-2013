package lab.thread;

public class Consumer implements Runnable
{
Queue q;
int id;

public Consumer(Queue qu,int sn)
{
	q=qu;
	id=sn;
	new Thread(this,"Consumer").start();
}

public void run()
{

	while(true)
	{
		q.get(id);
		
	}
}
	
}
