package com.main.intoduction.oops.innerclass;


//Outer class
class OuterClass {
 private int outerData = 10;

 // Non-static inner class
 class InnerClass {
     private int innerData;

     public InnerClass(int data) {
         this.innerData = data;
     }

     public void display() {
         System.out.println("Outer data: " + outerData);
         System.out.println("Inner data: " + innerData);
     }
 }
}
public class InstanceInner {
	public static void main(String[] args) {
	    
	     OuterClass outer = new OuterClass();

	     // Using the non-static inner class
	     OuterClass.InnerClass inner = outer.new InnerClass(20);
	     inner.display();
	 }
}
