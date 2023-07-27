//Write a Java program to implement a lambda expression to replace vowels with ‘#’ in a given string.
//@FunctionalInterface
interface Inter1
{
	String replace(String s);
}
 class StringReplace 
{
	public static void main(String ar[])
	{
	Inter1 inter1=(s)->s.replaceAll("[aeiouAEIOU]","#");
	
	String replaced=inter1.replace("RaeiouM");
	System.out.println(replaced);
}
}