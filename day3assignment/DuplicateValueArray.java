package day3assignment;

import java.util.Arrays;

public class DuplicateValueArray {

	public static void main(String[] args) {
		DuplicateValueArray objDuplicate=new DuplicateValueArray();
		objDuplicate.FindDuplicateValue();

	}
	public void FindDuplicateValue()
	{
		int[] Nums = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Arrays.sort(Nums);
		for(int i=0;i<Nums.length-1;i++)
		{
			if(Nums[i]==Nums[i+1])
			System.out.println("Duplicate Value is "+Nums[i+1]);
		}
	}
	}


