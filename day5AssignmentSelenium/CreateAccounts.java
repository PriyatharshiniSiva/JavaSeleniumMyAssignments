package day5AssignmentSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccounts {

	public static void main(String[] args) {
		CreateAccounts objCA=new CreateAccounts();
		objCA.createAccountsSL();
	}
	public void createAccountsSL()
	{
		int index;
		ChromeDriver objDriver=new ChromeDriver(); 
		objDriver.get("http://leaftaps.com/opentaps/control/login");
		objDriver.manage().window().maximize();
		objDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		objDriver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		objDriver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		objDriver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		objDriver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		//Click Accounts
		objDriver.findElement(By.xpath("//a[text()='Accounts']")).click();
		objDriver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		objDriver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		objDriver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Teste");
		objDriver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("SeleniumXpath");
		objDriver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("www.newenter.com");
       objDriver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("5000");
	
     //Fetch DrpDownValue
   	WebElement op=objDriver.findElement(By.name("industryEnumId"));
   Select objDrpValue=new Select(op);
   objDrpValue.selectByIndex(2);

   WebElement opEle=objDriver.findElement(By.name("ownershipEnumId"));
   Select objCorpDrp=new Select(opEle);
   objCorpDrp.selectByVisibleText("S-Corporation");


   WebElement opEle2=objDriver.findElement(By.id("dataSourceId"));
   Select objEmployeeDrp=new Select(opEle2);
   objEmployeeDrp.selectByValue("LEAD_EMPLOYEE");

   WebElement opEle3=objDriver.findElement(By.id("marketingCampaignId"));
   Select objMarkDrp=new Select(opEle3);
   objMarkDrp.selectByIndex(5);
   
   WebElement opEle4=objDriver.findElement(By.id("generalStateProvinceGeoId"));
   Select objStateDrp=new Select(opEle4);
   objStateDrp.selectByValue("TX");

   objDriver.findElement(By.xpath("//input[@class='smallSubmit']")).click();	
				
				
				
	/*	String[] strlist=new String[opEle.getSize().height];
		
		for(int i=0;i<=strlist.length;i++)
		{
			if(strlist[i]=="annualRevenue")
			{
			index=i;
			}
		}
		objDriver.findElement(By.xpath("(//input[@class='inputBox'])"+[index])).*/
		
	}

}
