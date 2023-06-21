package day3assignment;

public class ReverseEvenPosition {

	public static void main(String[] args) {
		ReverseEvenPosition objRevEvenIndex=new ReverseEvenPosition();
		objRevEvenIndex.reverseEvenWord();
	}
	public void reverseEvenWord()
	{
		String str="I am a software tester";
		String[] words = str.split(" ");
		String reversedString = "";
		String reverseWord = "";
		
		for (int i = 0; i < words.length; i++)
	        {
			
			if(i%2!=0)
			{
	           String word = words[i]; 
	           
	  for (int j = word.length()-1; j >= 0; j--) 
		   {
		  char[] chValue=word.toCharArray();
			
			reverseWord = reverseWord + chValue[j];
				  
			}
	  reversedString = "";
		reversedString = reversedString + reverseWord;
		reverseWord="";
		  
		System.out.print(reversedString+" ");
			}
			else
			{
				reversedString=words[i]+" ";
				System.out.print(reversedString);
			}
			
			
	}
		
	}
}


