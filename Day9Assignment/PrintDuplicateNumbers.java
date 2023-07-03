package week3.Day9Assignment;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		PrintDuplicateNumbers objDupNum=new PrintDuplicateNumbers();
		objDupNum.findDuplicateNumbers();
	}
public void findDuplicateNumbers()
{
	int[] data = {4,3,6,8,29,1,2,4,7,8};
	Set<Integer> UnqNum=new HashSet<Integer>();
	Set<Integer> dupNum=new HashSet<Integer>();
	for(int i=0;i<data.length;i++)
{
		boolean add=UnqNum.add(data[i]);
		if(!add)
		{
			dupNum.add(data[i]);
		}
		
		}
	System.out.println(dupNum);
	
}
}
