//In this program we have not declared 
//entire class as final because we wanted to change the defination of subtraction method
class FinalDemoMethod
{
		//this method is declare as final so no one can 
		//outside the class change the body name of the company
		final void companyName()
		{
			System.out.println("This is companyName NucleusTeq");
		}
		 void subtraction(int x,int y)
		{
		System.out.println("subtraction is : "+(x-y));	
		}
}
class SubClass extends FinalDemoMethod
{
	//we have changed the defination of the subtraction method
	@Override
	void subtraction(int x,int y)
	{
		System.out.println("addition is : "+(x+y));
	}
}
public class FinalMethod
{
	public static void main(String ar[])
	{
		FinalDemoMethod finalDemo=new SubClass();
		finalDemo.companyName();
		finalDemo.subtraction(10,5);	
	}
}