package com.main.intoduction.oops.innerclass;


abstract class AnonymousInnerClass {
    abstract void displayMessage();
}

public class AnonymousInner {
    public static void main(String[] args) {

        
    	AnonymousInnerClass obj = new AnonymousInnerClass() {

           
            @Override
            void displayMessage() {
                System.out.println("Hello from the anonymous inner class!");
            }
        };

        
        obj.displayMessage();
    }
}
