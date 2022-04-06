package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pom.Page_Object_Model;

public class LogInPage extends driver{
	
String baseUrl="http://test.beacontech.xyz/";
	
	@Test
	public void locatorlearning() throws InterruptedException {
		
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		//get_title
		String actualTitleOfTheSite=driver.getTitle();
		//String titleOfThePage=driver.getTitle();
		System.out.println("The Title of the site is: "+ actualTitleOfTheSite);
		//Assert.assertEquals("My Stores", actualTitleOfTheSite);
		
		Thread.sleep(3000);
		Page_Object_Model user=new Page_Object_Model();
		
		//log_IN
		driver.findElement(By.id("UserName")).sendKeys(user.username);
		
		driver.findElement(By.id("Password")).sendKeys(user.password);
		//Thread.sleep(2000);
		
		driver.findElement(By.className("col-xs-4")).click();
		Thread.sleep(2000); 
	
	
	}
}