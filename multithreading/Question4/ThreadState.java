class Thread1 extends Thread
{
	public void run()
	{
	for(int i=1;i<5;i++)
	{
	System.out.println(Thread.currentThread().getName()+" i is "+i);	
	try{Thread.sleep(2000);}catch(Exception e){}
	}
	}
}
class ThreadState
{
	public static void main(String ar[])
	{
		Thread1 thread1=new Thread1();
		thread1.setName("ram");
		System.out.println(thread1.getName()+" status is : "+thread1.getState());
		thread1.start();
		try{
		Thread.sleep(1000);
		
		}catch(Exception r){}
		System.out.println(thread1.getName()+" status is : "+thread1.getState());
		try{
		thread1.join();
		
		}catch(Exception r){}
		System.out.println(thread1.getName()+" status is : "+thread1.getState());
		
	}
}