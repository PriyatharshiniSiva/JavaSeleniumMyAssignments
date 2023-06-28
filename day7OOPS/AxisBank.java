package day7OOPS;

public class AxisBank extends BankInfo  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank objDeposit=new AxisBank();
		objDeposit.deposit();
	}
	public void deposit()
	{
		System.out.println("Axis Bank Deposit method overrides");
	}

}
