/*Create a Integer collection and store 20 elements in it
● Display elements of in reverse order without using for loop
● Update elements of list by 5 whenever there is an element
greater than 50 is encountered.
● Display elements less than 60

*/
package javaprograms.Collection.Question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<20;i++)
		{
			list.add(i*4);
		}
		System.out.println("original list: "+list);
		Collections.reverse(list);
		System.out.println("List after reversing: "+list);
		
		for(int i=0;i<20;i++)
		{
			if(list.get(i)>50)
			{
			list.set(i, list.get(i)+5);
			}
		}
		System.out.println("List after Addition of 5: "+list);
		System.out.print("List data greatwer than 60: ");
		for(Integer i:list)
		{
			if(i>60)
			System.out.print(i+"\t");
		}
		
		

	}

}
