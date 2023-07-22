package com.main.intoduction;

public class StringClass {

	public static void main(String[] args) {
	// length() method
		String s1="Ramji";
		String s2="Sitaji";
		
		System.out.println("The length of the given string "+s1+" is: "+s1.length());
		System.out.println("--------");
		
		//concate() method
		System.out.println("The concatenation of "+s1+" and "+s2+" is: "+s1.concat(s2));
		System.out.println("--------");
		
		//charAt() method
		int n=2;
		System.out.println("Character at position "+n+" is "+s1.charAt(n));
		System.out.println("--------");
		
		//Check if a String starts with a given character or String -> startsWith(String char)
		String s3="Indore";
		System.out.println(s3.startsWith("In"));
		System.out.println(s3.startsWith("re"));
		System.out.println("--------");
		
		//Find index of a given character or string from a String
		String s4="I live in indore";
		System.out.println(s4.indexOf("I"));
		System.out.println(s4.indexOf("indore"));
		System.out.println("--------");
		
		//Replace a character from a String
		String s5="I work at Nucleusteq";
		System.out.println(s5.replace('q', 'Q'));
		System.out.println("--------");
		
		//Other five methods of String class
		//equals method
		String s11="ram";
		String s12="sita";
		String s13="ram";
		System.out.println(s11.equals(s12));//false
		System.out.println(s11.equals(s13));//true
		System.out.println("--------");
		
		//contains method
		String s50="ramji";
		System.out.println(s50.contains("ram"));//true
		System.out.println(s50.contains("ij"));//false
		System.out.println("--------");
		
		//isEmpty() method
		String s51="";
		String s52="sdas";
		System.out.println(s51.isEmpty());//true
		System.out.println(s52.isEmpty());//false
		System.out.println("--------");
		
		//split() method
		String ss="aam rama shyama";
		String arr[]=ss.split(" ");
		for(String ds:arr)
		{
			System.out.println(ds);
		}
		System.out.println("--------");
		
		//compareTo()
		String sc1="Ramji";
		String sc2="Ritaji";
		System.out.println(sc1.compareTo(sc2));
		//System.out.println(s52.isEmpty());
		System.out.println("--------");

	}

}
