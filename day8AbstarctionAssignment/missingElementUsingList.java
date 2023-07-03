package day8AbstarctionAssignment;

import java.util.ArrayList;
import java.util.List;

public class missingElementUsingList {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,7,6,8};
		List<Integer> lst1 = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			lst1.add(arr[i]);
		}
		for (int i = 0; i < arr.length+1; i++) {
			if (lst1.get(i)!=i+1) {
				System.out.println("The missing number is "+(i+1));
				break;
			}
			
		}

	}

}
