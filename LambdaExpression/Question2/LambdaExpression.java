//Create a functional interface with the name ‘Shape’ and a method ‘area’.
// Write a program to implement this interface for shapes, rectangle, square, circle, cube, sphere, 
//cylinder and find out its area. All the implementation should be within a single class.

interface Shape
{
	float area(float... x);
}
class LambdaExpression
{

public static void main(String ar[])
{
	//area of rectangle
	Shape rectangle=(a)->a[0]*a[1];
	float area1=rectangle.area(12,4);
	System.out.println("Area of rectangle is: "+area1);

	//area of square
	Shape square=(r)->(float)(r[0]*r[0]);
	float area2=square.area(4);
	System.out.println("Area of square is: "+area2);
	
	//area of circle
	Shape circle=(a)->3.14f*a[0]*a[0];
	float area3=circle.area(2,2);
	System.out.println("Area of circle is: "+area3);
	
	//area of sphere
	Shape sphere=(a)->4*3.14f*a[0]*a[0];
	float area4=sphere.area(5,5);
	System.out.println("Area of sphere is: "+area4);
	
	//area of cylinder
	Shape cylinder=(a)->2*3.14f*a[0]*(a[0]+a[1]);
	float area5=cylinder.area(3,5);
	System.out.println("Area of Cylinder is: "+area5);
	
	//area of cube
	Shape cube=(a)->6*a[0]*a[0];
	float area6=cube.area(5,5);
	System.out.println("Area of cube is: "+area6);
}}