package Day2Assignment;

public class FindFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 8;
		FindFibonacciSeries objFibo=new FindFibonacciSeries();
		System.out.println("The fibonacci Number is "+objFibo.fibonacci(num));
        
	}
	public int fibonacci (int n)
	{
	    {
	        int firstNum = 0, secondNum = 1, thirdNum;
	        if (n == 0)
	        {
	            return firstNum;
	        }
	        for (int i = 2; i <= n; i++) 
	        {
	        	thirdNum = firstNum + secondNum;
	            firstNum = secondNum;
	            secondNum = thirdNum;
	        }
	        return secondNum;
	    }
	 
	   
	}
	    }




