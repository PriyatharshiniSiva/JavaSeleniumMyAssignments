package day5AssignmentSelenium;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLoginCreate {

	public static void main(String[] args) {
		FacebookLoginCreate objLoginCreate=new FacebookLoginCreate();
		objLoginCreate.createFacebookLogin();

	}
	public void createFacebookLogin() 
	{
		try
		{
	ChromeDriver objDriver=new ChromeDriver(); 
	objDriver.get("https://en-gb.facebook.com/");
	objDriver.manage().window().maximize();
	objDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//Xpath to set the values
	objDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("ptharini11@gmail.com");
	objDriver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Pwd123");
	objDriver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	objDriver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sivakumar");
	objDriver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sundaram");
	objDriver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("thariniNew@gmail.com");
	objDriver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("pwd123");
	WebElement op=objDriver.findElement(By.id("day"));
	
	//Day
	Select drpDay=new Select(op);
	drpDay.selectByVisibleText("12");
	//Month
	WebElement op1=objDriver.findElement(By.id("month"));
	Select drpMonth=new Select(op1);
	drpMonth.selectByIndex(10);
	//year
	WebElement op2=objDriver.findElement(By.id("year"));
	Select drpyear=new Select(op2);
	drpyear.selectByIndex(10);
	
	objDriver.findElement(By.xpath("//label[text()='Female']")).click();
	
	}
		catch(Exception e)
		{
		
		}
		}
	}


