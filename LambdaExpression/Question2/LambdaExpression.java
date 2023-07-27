//Create a functional interface with the name ‘Shape’ and a method ‘area’.
// Write a program to implement this interface for shapes, rectangle, square, circle, cube, sphere, 
//cylinder and find out its area. All the implementation should be within a single class.

interface Shape
{
	float area(float x,float y);
}
class LambdaExpression
{

public static void main(String ar[])
{
	//area of rectangle
	Shape rectangle=(l,b)->l*b;
	float area1=rectangle.area(12,4);
	System.out.println("Area of rectangle is: "+area1);

	//area of square
	Shape square=(s1,s2)->s1*s2;
	float area2=square.area(4,4);
	System.out.println("Area of square is: "+area2);
	
	//area of circle
	Shape circle=(r1,r2)->3.14f*r1*r2;
	float area3=circle.area(2,2);
	System.out.println("Area of circle is: "+area3);
	
	Shape sphere=(r1,r2)->4*3.14f*r1*r2;
	float area4=sphere.area(5,5);
	System.out.println("Area of sphere is: "+area4);
	
	Shape cylinder=(r,h)->2*3.14f*r*(r+h);
	float area5=cylinder.area(3,5);
	System.out.println("Area of Cylinder is: "+area5);
}}