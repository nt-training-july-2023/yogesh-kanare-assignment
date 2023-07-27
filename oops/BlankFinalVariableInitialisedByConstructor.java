class A
{
	final int x;
	//with the help of using constructor we are initializing blank final variable
	A()
	{
		this.x=100;
	}
	void display()
	{
		System.out.println("x :"+x);
	}
}
public class BlankFinalVariableInitialisedByConstructor
{
	public static void main(String ar[])
	{
		A a1=new A();
		//A a=new A(20);
		a1.display();
	}
}