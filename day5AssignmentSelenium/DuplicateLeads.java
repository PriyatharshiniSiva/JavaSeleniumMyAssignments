package day5AssignmentSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLeads {

	public static void main(String[] args) {
		DuplicateLeads objDuplicate=new DuplicateLeads();
		objDuplicate.createDuplicateLeads();

	}
	public void createDuplicateLeads() 
	{
		String strTitle;
	ChromeDriver objDriver=new ChromeDriver(); 
	objDriver.get("http://leaftaps.com/opentaps/control/login");
	objDriver.manage().window().maximize();
	objDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	objDriver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
	objDriver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	objDriver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	//objDriver.findElement(By.className("decorativeSubmit")).click();
	
objDriver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
	
	
	objDriver.findElement(By.xpath("//a[contains(text(), 'Create Lead')]")).click();
	objDriver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Cognizant");
	objDriver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Priya");
	objDriver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Sivakumar");
	objDriver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("abc123@gmail.com");
	objDriver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("9867353612");
	
	objDriver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Jacob");
	objDriver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("SampleSeleniumProject");
	objDriver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Testing");
	
	objDriver.findElement(By.xpath("//input[@name='submitButton']")).click();
	objDriver.findElement(By.xpath("//a[contains(text(),'Duplicate Lead')]")).click();
	//Clear the values
	objDriver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).clear();
	objDriver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).clear();
	
	
	//Set value since its mandatory
	objDriver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("NewCognizant");
	objDriver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("NewPriya");
	objDriver.findElement(By.xpath("//input[@name='submitButton']")).click();
	//GetTitle
	strTitle=objDriver.getTitle();
System.out.println(strTitle);
	}

}
