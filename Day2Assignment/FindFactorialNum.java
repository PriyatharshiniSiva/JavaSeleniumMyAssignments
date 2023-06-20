package Day2Assignment;

public class FindFactorialNum {

	public static void main(String[] args) {
		
		FindFactorialNum objFactNum=new FindFactorialNum();
		objFactNum.factorialNum(8);
	}
	public void factorialNum(int num)
	{
		int factorial=1; 
		if(num==0)
		{
			System.out.println("factorial of Number "+num+"="+num);
		}
		else
		{
        for(int i=1;i<=num;i++)
  	     {
        	factorial=factorial*i;
	 	 }

	        System.out.println("factorial of Number "+num+"="+factorial);
		}
	}

}
