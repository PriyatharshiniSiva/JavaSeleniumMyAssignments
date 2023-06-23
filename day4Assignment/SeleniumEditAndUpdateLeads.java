package day4Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEditAndUpdateLeads {

	public static void main(String[] args) {
		SeleniumEditAndUpdateLeads objEditLeads=new SeleniumEditAndUpdateLeads();
		objEditLeads.editAndUpdateLeads();

	}
	public void editAndUpdateLeads()
	{
		try {
	ChromeDriver objDriver=new ChromeDriver();
	objDriver.get("http://leaftaps.com/opentaps/control/login");
	objDriver.manage().window().maximize();
	objDriver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	objDriver.findElement(By.id("password")).sendKeys("crmsfa");
	objDriver.findElement(By.className("decorativeSubmit")).click();
	
	
	Thread.sleep(1000);
	
	objDriver.findElement(By.linkText("CRM/SFA")).click();
	
	Thread.sleep(1000);
	objDriver.findElement(By.linkText("Create Lead")).click();
	
	
	objDriver.findElement(By.id("createLeadForm_companyName")).sendKeys("Hexacorp");
	objDriver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jayaram");
	objDriver.findElement(By.id("createLeadForm_lastName")).sendKeys("SadaSivam");
	objDriver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
	
	objDriver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9867353612");
	
	objDriver.findElement(By.className("smallSubmit")).click();
	Thread.sleep(1000);
	
objDriver.findElement(By.linkText("Edit")).click();
Thread.sleep(1000);
objDriver.findElement(By.id("updateLeadForm_companyName")).clear();
objDriver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Cognizant");
objDriver.findElement(By.className("smallSubmit")).click();
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
