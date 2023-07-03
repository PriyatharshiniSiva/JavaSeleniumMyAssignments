package week3.Day9Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicates objDup=new RemoveDuplicates();
	}
	public RemoveDuplicates()
	{
		String strValue="PayPal India";
		String output="";
		char[] chValue=strValue.toCharArray();
		Set<Character> charSet=new LinkedHashSet<Character>();
		Set<Character> dupCharSet =new LinkedHashSet<Character>();
		
			for(Character i:chValue)
			{
				if(charSet.add(i))
				{
					output+=i;
				}
				else
				{
					dupCharSet.add(i);
				}
			}
		
		System.out.println("Name without duplicate values is: "+output);
		
	
	}
}


