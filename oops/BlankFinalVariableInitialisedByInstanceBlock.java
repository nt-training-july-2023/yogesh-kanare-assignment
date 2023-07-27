class A
{
	final int z;
	//with the help of using instance block we are initializing blank final variable
	{
		this.z=500;
	}
	void display()
	{
		System.out.println("z :"+z);
	}
}
public class BlankFinalVariableInitialisedByInstanceBlock
{
	public static void main(String ar[])
	{
		A a1=new A();
		a1.display();
	}
}