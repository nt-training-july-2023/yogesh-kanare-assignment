package com.main.intoduction;

public class StringAndStringBuilder {

	public static void main(String[] args) {
		//here String is immutable in nature because when we are making changes in string s1
		//new object for s1+"sita" is created
		//we can check this by hashcode.
		//Hashcode for s1 is changed before and after concatenation
		
		
		System.out.println("-------------------String program-------------------");
		String s1="ram";
		System.out.println(s1);
		System.out.println("String s1 hashcode before concatenation: "+s1.hashCode());
		System.out.println();
		s1=s1+"sita";
		System.out.println(s1);
		System.out.println("String s1 hashcode before concatenation: "+s1.hashCode());
		
		System.out.println("-------------------StringBuilder program-------------------");
		//StringBuilder is mutable in nature
		//In the below outputs we can clearly see that the hashvalue for the str before 
		//and after apped is same, it means no other object is created
		StringBuilder str=new StringBuilder();
		str.append("sita");
		System.out.println(str.toString());
		
		//hashvalue->1277181601
		System.out.println("StringBuilder str hashcode before concatenation: "+str.hashCode());
		System.out.println();
		str.append(" and gita");
		System.out.println(str.toString());
		//hashvalue->1277181601
		System.out.println("StringBuilder str hashcode before concatenation: "+str.hashCode());
	}

}
