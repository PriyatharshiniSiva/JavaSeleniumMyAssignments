package day8AbstarctionAssignment;

public class Automation extends MultipleLangauge implements Language,TestToolNew{

	public static void main(String[] args) {
		Automation objAbstract=new Automation();
		objAbstract.python();
		objAbstract.ruby();
		objAbstract.java();
		objAbstract.Selenium();
	}
	public void ruby()
	{
		System.out.println("Call from ruby-Parent class");
	}
	public void java() {
		System.out.println("Call from java class");
	}
	
	public void Selenium() {
		System.out.println("Call from Selenium class");
	}
	
	

}
