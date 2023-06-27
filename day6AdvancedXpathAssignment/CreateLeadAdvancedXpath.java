package day6AdvancedXpathAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadAdvancedXpath {

	public static void main(String[] args) {
		CreateLeadAdvancedXpath objCreateLead=new CreateLeadAdvancedXpath();
		objCreateLead.createLeadAdvancedXpath();
	}
	public void createLeadAdvancedXpath() {
		
		ChromeDriver objDriver=new ChromeDriver(); 
		objDriver.get("http://leaftaps.com/opentaps/control/login");
		objDriver.manage().window().maximize();
		objDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Elder sibling to younger sibling
		objDriver.findElement(By.xpath("//label[text()='Username']/following-sibling::input")).sendKeys("DemoSalesManager");
		//Elder sibling to younger sibling
		objDriver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("crmsfa");
		
		//GrandParent to GrandChild
		objDriver.findElement(By.xpath("(//div[@id='form']//input)[3]")).click();
		//Parent to child
		objDriver.findElement(By.xpath("//div[@id='label']/a")).click();
		//GrandParent to GrandChild
		objDriver.findElement(By.xpath("(//div[@class='frameSectionBody']//a)[1]")).click();
		
		//Younger sibling to Elder sibling(Company)
		objDriver.findElement(By.xpath("//span[contains(text(),'Parent')]/preceding::input[@id='createLeadForm_companyName']")).sendKeys("Cognizant");
	
	//Elder sibling to younger sibling(FirstName)
		objDriver.findElement(By.xpath("(//span[contains(text(),'First')]/following::input)[1]")).sendKeys("Priya");
		
		//Elder sibling to younger sibling(LastName)
		objDriver.findElement(By.xpath("(//span[contains(text(),'Last name')]/following::input)[1]")).sendKeys("Sivakumar");
	
	
		 //Fetch DrpDownValue
	   	WebElement op=objDriver.findElement(By.id("createLeadForm_marketingCampaignId"));
	   Select objDrpValue=new Select(op);
	   objDrpValue.selectByValue("9001");

	   WebElement opEle=objDriver.findElement(By.id("createLeadForm_ownershipEnumId"));
	   Select objCorpDrp=new Select(opEle);
	   objCorpDrp.selectByIndex(3);


	   WebElement opEle2=objDriver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	   Select objEmployeeDrp=new Select(opEle2);
	   objEmployeeDrp.selectByVisibleText("India");

	  objDriver.findElement(By.xpath("//div[@class='fieldgroup']//input[@class='smallSubmit']")).click();
	
	  String strTitle=objDriver.getCurrentUrl();
	  System.out.println(strTitle);
	}
	
	

}
