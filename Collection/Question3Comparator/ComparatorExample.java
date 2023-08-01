/*
 Implement Comparable and Comparator Interfaces to
understand its functionality
 */



//with the help of using comparator we can sort predefined class data also
package javaprograms.Collection.Question3Comparator;

import java.util.TreeSet;

public class ComparatorExample{

	public static void main(String[] args) {
		TreeSet<Integer> list=new TreeSet<>((a,b)->(b-a));
		list.add(10);
		list.add(200);
		list.add(-30);
		list.add(40);
		System.out.println("data is descending ording: "+list);
		

	}

}
