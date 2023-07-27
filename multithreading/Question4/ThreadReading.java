class ThreadReading extends Thread
{

String message;
public ThreadReading()
{}
public ThreadReading(String message)
{
	this.message=message;
	start();
}
public void run()
{
	System.out.println(Thread.currentThread().getName());
	System.out.println(message);
}
public static void main(String ar[])
{	
	ThreadReading threadReading1=new ThreadReading("Helllo! How are you");
	try{Thread.sleep(2000);}catch(Exception e){}
	ThreadReading threadReading2=new ThreadReading("Hey! I am fine at all");
	System.out.println();
	
}
}
