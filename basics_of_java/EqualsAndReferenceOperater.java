package com.main.intoduction;

public class EqualsAndReferenceOperater {

	public static void main(String[] args) {

		String s1=new String("NucleusTeq-1");
		String s2=new String("NucleusTeq-2");
		String s3=new String("NucleusTeq-1");
		System.out.println(s1.equals(s3));//true
		System.out.println(s1==s3);//false

	}

}
