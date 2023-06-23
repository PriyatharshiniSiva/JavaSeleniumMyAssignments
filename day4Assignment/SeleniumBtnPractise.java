package day4Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBtnPractise {

	public static void main(String[] args) {
		SeleniumBtnPractise objBtnClick=new SeleniumBtnPractise();
		objBtnClick.checkButtonClick();

	}
	public void checkButtonClick()
	{
		try {
		ChromeDriver objDriver=new ChromeDriver();
		objDriver.get("https://www.leafground.com/button.xhtml");
		
			Thread.sleep(1000);
		
	
		objDriver.findElement(By.id("j_idt88:j_idt90")).click();
		Thread.sleep(1000);
		objDriver.findElement(By.id("j_idt88:j_idt92")).click();
		
		objDriver.findElement(By.className("ui-button-text ui-c")).click();
	}
	
	catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
