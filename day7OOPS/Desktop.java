package day7OOPS;

public class Desktop extends Computer {

	public static void main(String[] args) {
		Desktop objDesk=new Desktop();
		objDesk.computerModel();
		objDesk.desktopSize();

	}
	public void desktopSize()
	{
		System.out.println("Desktop size is 17 inch");
	}

}
