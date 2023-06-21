package day3assignment;

import java.util.Arrays;

public class SecondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondLargestNum objFindLargeNum=new SecondLargestNum();
		objFindLargeNum.findSecondLargeNum();

	}
	public void findSecondLargeNum()
	{
		int[] num = {45,22,76,34,99,108};
		int length=num.length;
	Arrays.sort(num);
	System.out.println("The Second Largest Number is "+num[length-2]);
	}

}
