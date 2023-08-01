/*Create a String collection and store 20 elements in it
● Elements stored should not be repeated.
● Elements stored should preserve the insertion order
● Implement different methods for this collection
*/

package javaprograms.Collection.Question2;

import java.util.LinkedHashSet;

public class StringList {

	public static void main(String[] args) {
		LinkedHashSet<String> list=new LinkedHashSet<>();
		char c='a';
		for(int i=0;i<20;i++)
		{
			list.add("aaa"+c++);	
		}
		
		//this will not be added
		System.out.println(list.add("aaaa"));
		System.out.println(list);
		
		//implementing different methods
		
		//if data present this method will return true otherwise false
		System.out.println(list.contains("aaaa"));
		
		
		//This method will clear the whole list
		list.clear();
		System.out.println(list);
		
		//if list is empty this method will return true otherwise false
		System.out.println(list.isEmpty());

	}

}
