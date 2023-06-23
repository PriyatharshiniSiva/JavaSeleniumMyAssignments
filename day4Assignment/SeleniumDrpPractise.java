package day4Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDrpPractise {

	public static void main(String[] args) {
		SeleniumDrpPractise objDrpClick=new SeleniumDrpPractise();
		objDrpClick.checkDropDownClick();

	}
	
	public void checkDropDownClick()
	{
		try {
		ChromeDriver objDriver=new ChromeDriver();
		objDriver.get("https://www.leafground.com/select.xhtml");
		objDriver.manage().window().maximize();
		objDriver.findElement(By.className("ui-selectonemenu")).sendKeys("Playwright");
		objDriver.findElement(By.id("j_idt87:country_label")).sendKeys("USA");
		objDriver.findElement(By.id("j_idt87:city_label")).sendKeys("Denver");
		objDriver.findElement(By.id("j_idt87:lang_label")).sendKeys("English");
		objDriver.findElement(By.id("j_idt87:value_label")).sendKeys("One");
		Thread.sleep(1000);
		
	}
	
	catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
