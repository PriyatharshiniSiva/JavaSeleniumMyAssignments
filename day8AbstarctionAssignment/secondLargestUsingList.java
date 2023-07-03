package day8AbstarctionAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class secondLargestUsingList {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		List<Integer> lstNum = new ArrayList<Integer>();
		for (int i = 0; i < data.length; i++) {
			lstNum.add(data[i]);
		}
		Collections.sort(lstNum);
		int lstSize = lstNum.size()-2;
		
		System.out.println("Second Largest from the List is : "+lstNum.get(lstSize));

	}

}
