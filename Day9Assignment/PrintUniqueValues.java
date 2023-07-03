package week3.Day9Assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueValues {

	public static void main(String[] args) {
		PrintUniqueValues objUnqChr=new PrintUniqueValues();
		objUnqChr.findUninqueCharacterSet();
	}
	public void findUninqueCharacterSet()
	{
		String strName="Priyatharshini";
		String strVal="";
		Set<Character> value=new LinkedHashSet<Character>();
		char[] chName=strName.toCharArray();
		for(Character i:chName)
		{
			if(value.add(i))
			{
				strVal+=i;
			}
		}
		System.out.println(strVal);
		
	}

}
