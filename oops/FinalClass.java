//the class here is final because all the confidential details of the company can not be changed or even inherited by 
// by other class
final class A{
	void companyDetails()
	{
		System.out.println("this company details are confidential");
	}
	void companyPartners()
	{
		System.out.println("This are the company partners");
	}
}
public class FinalClass
{
	public static void main(String ar[])
	{
		A a=new A();
		a.companyDetails();
		a.companyPartners();
	}
}