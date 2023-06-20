package Day2Assignment;

public class ConvertNegToPos {

	public static void main(String[] args) {
		ConvertNegToPos objChkNegNumber=new ConvertNegToPos();
	objChkNegNumber.checkNegNumber(-25);
	}
	
	public void checkNegNumber(int num)
	{ 
		if(num<0)
		{
			
			System.out.println("The Given number is Negative:"+num);
			num=(-num);
			System.out.println("The Number is converted to positive:"+num);
		}
		
		else
		{ 
			 System.out.println("The Given number is Positive:"+num);
		
		}
	
	}
	

}
