//Create a program where you check running threads (should be 3 Threads and more)
import subclass.*;
public class MyMain
{
	
	public static void main(String ar[])
	{
	Thread1 thread1=new Thread1();	
	Thread2 thread2=new Thread2();	
	Thread3 thread3=new Thread3();	
	
	//here by calling currentThread() we got the oject of current runnig method
	Thread myMainThread=Thread.currentThread();
	
	myMainThread.setName("thread-main");
	thread1.setName("thread-1");
	thread1.setName("thread-2");
	thread1.setName("thread-3");
	thread1.start();
	thread2.start();
	thread3.start();
	
	
	
	//here by calling getThreadGroup() method we grouped all the runnig threads
	ThreadGroup threadGroup=myMainThread.getThreadGroup();
	
	//by calling activeCount() method we got the count of runnig method
	int threadCount=threadGroup.activeCount();
	
	//creating array for collecting all thread in array
	Thread threadList[]=new Thread[threadCount];

		//using enumerate() we copying the data of threadGroup in array
		threadGroup.enumerate(threadList);
		
		System.out.println("Active threads are : ");
		for(int i=0;i<threadCount;i++)
		{
			System.out.println(threadList[i].getName());
		}
		
	
	}
}



