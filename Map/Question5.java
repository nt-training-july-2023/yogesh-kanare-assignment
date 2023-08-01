//Retrieve all the keys and all the values and print them on the console separately
package javaprograms.Map;

import java.util.HashMap;
import java.util.Map;

public class Question5 {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<>();
		map.put(101,"ram");
		map.put(104, "sita");
		map.put(103,"Githa");
		
		for(Map.Entry<Integer,String> entry:map.entrySet())
		{
			System.out.println("Key : "+entry.getKey()+", Value : "+entry.getValue());
		}

	}

}
