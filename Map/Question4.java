//Check whether the map contains the key or value. 


package javaprograms.Map;

import java.util.HashMap;
import java.util.Map;

public class Question4 {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<>();
		map.put(101,"ram");
		map.put(104, "sita");
		map.put(103,"Githa");
		System.out.println(map.containsKey(101));

	}

}
