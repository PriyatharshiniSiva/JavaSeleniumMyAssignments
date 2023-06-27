package day6AdvancedXpathAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeadAdvancedXpath {

	public static void main(String[] args) {
		
		EditLeadAdvancedXpath objEdit=new EditLeadAdvancedXpath();
		objEdit.EditLeadXpath();
	}
public void EditLeadXpath() {
		
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
				//Click Leads Tab
				objDriver.findElement(By.xpath("(//div[@class='x-panel-header'])[2]/a")).click();
				//GrandParent to GrandChild(Click FindLeads)
				objDriver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[3]")).click();
				//GrandParent to GrandChild(Click FirstLeads)
				objDriver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();
				
				String strTitle=objDriver.getCurrentUrl();
				System.out.println(strTitle);
				
				objDriver.findElement(By.xpath("(//div[@class='frameSectionExtra'])[2]/a[contains(text(),'Edit')]")).click();
				
				//Change Company Name
				objDriver.findElement(By.xpath("//span[text()='Company Name']/following::input[@id='updateLeadForm_companyName']")).clear();
				
				objDriver.findElement(By.xpath("//span[text()='Company Name']/following::input[@id='updateLeadForm_companyName']")).sendKeys("NewValueAdded");
				
				 objDriver.findElement(By.xpath("//div[@class='fieldgroup']//input[@class='smallSubmit']")).click();
				 objDriver.close();
}

}
