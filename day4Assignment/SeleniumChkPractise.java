package day4Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChkPractise {

	public static void main(String[] args) {
		SeleniumChkPractise objChkClick=new SeleniumChkPractise();
		objChkClick.checkBoxSelect();

	}
	public void checkBoxSelect()
	{
		
		ChromeDriver objDriver=new ChromeDriver();
		objDriver.get("https://www.leafground.com/checkbox.xhtml");
		objDriver.manage().window().maximize();
		objDriver.findElement(By.id("j_idt87:j_idt89")).click();
		objDriver.findElement(By.id("j_idt87:j_idt91")).click();
		objDriver.findElement(By.xpath("//label[text()='C-Sharp']")).click();
		objDriver.findElement(By.linkText("j_idt87:ajaxTriState")).click();
		
		
	}
	
	

}


