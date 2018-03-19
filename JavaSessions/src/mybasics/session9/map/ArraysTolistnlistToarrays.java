package mybasics.session9.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArraysTolistnlistToarrays {
	public static void main(String[] args) {
		List<Integer>num=new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		Integer [] numarr=(Integer[])num.toArray();// list to array
		
		List<Integer> newlist =Arrays.asList(numarr);//array to list
		List<Integer> newlist1 =Arrays.asList(1,2,2);
		
		//Example for list in a map n display
		
		Map<String, List<Integer>> numarrays=new HashMap<>();
		List<Integer> integers= Arrays.asList(5,10,15);
		numarrays.put("Multiple of 5", integers);
		
		for (Map.Entry<String, List<Integer>> integer: numarrays.entrySet()) {
			System.out.println(integer.getKey());
			for (Integer integer1 : integer.getValue()) {
				System.out.println(integer1);
			}
			
			
		}
		
		
		
		
		
		
		
		
	}


}
