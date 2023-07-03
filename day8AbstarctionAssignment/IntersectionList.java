package day8AbstarctionAssignment;

import java.util.ArrayList;
import java.util.List;

public class IntersectionList {

	public static void main(String[] args) {
		String strMsg="";
		int[] array1 = {3,2,11,4,6,7};
		int[] array2 = {1,2,8,4,9,7};
		List<Integer> lstFirst = new ArrayList<Integer>();
		List<Integer> lstSecond= new ArrayList<Integer>();
		
		for (int i = 0; i < array1.length; i++) {
			lstFirst.add(array1[i]);
		}
		
		for (int i = 0; i < array2.length; i++) {
			lstSecond.add(array2[i]);
		}
		strMsg="Intersection Numbers are ";
		System.out.println(strMsg);
		for (int i = 0; i < array2.length; i++) {
			if (lstFirst.get(i)==lstSecond.get(i)) {
				System.out.print(lstFirst.get(i)+" ");
			} 
	}
	}
}


