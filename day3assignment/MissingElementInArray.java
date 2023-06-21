package day3assignment;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingElementInArray objMissingArray=new MissingElementInArray();
	        objMissingArray.findMissing();

	}
	
	 public  void findMissing()
	    {
	       
	    	int arr[] = {1,2,3,4,7,6,8};
	        Arrays.sort(arr);
			for(int i=0;i<arr.length;i++)
			{
				if(i+1!=arr[i])
				{
				System.out.println("The Missing Number is "+(i+1));
				break;
				}
				
			}
	    }
	}


