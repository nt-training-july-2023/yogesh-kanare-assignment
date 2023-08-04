package com.main.intoduction.oops.innerclass;

//Outer Class
class OuterClass2 {
  private static int outerData = 10;

  //Static nested Class
  static class InnerClass {
      private int nestedData;

      //Constructor of Inner Class
      public InnerClass(int data) {
          this.nestedData = data;
      }

      public void display() {
          System.out.println("Outer data: " + outerData);
          System.out.println("Inner data: " + nestedData);
      }
  }
}

public class LocalInner {
  public static void main(String[] args) {
	  OuterClass2.InnerClass staticNested = new OuterClass2.InnerClass(20);
      staticNested.display();
  }
}
