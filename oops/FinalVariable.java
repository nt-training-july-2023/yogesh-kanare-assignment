class Xyz
{
	//here the variable x is constant so its value can't be changed
	 final int x=10;
}
class Zyx extends Xyz
{
	 void show()
	 {
	System.out.println("x: "+x);
}
}
public class FinalVariable
{
	public static void main(String ar[])
	{
		Zyx zyx=new Zyx();
		zyx.show();
	}
}