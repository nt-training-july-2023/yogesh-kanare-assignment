package com.main.intoduction.oops.innerclass;

//Outer Class
class OuterClass3 {
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

public class StaticInner {
  public static void main(String[] args) {
      OuterClass3.InnerClass staticNested = new OuterClass3.InnerClass(20);
      staticNested.display();
  }
}
