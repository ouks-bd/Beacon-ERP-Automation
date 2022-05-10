package testcase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pom.Page_Object_Model;

public class LogInPage extends driver{
	
String baseUrl="http://test.beacontech.xyz/";
	
	@Test
	public void test () throws InterruptedException {
		
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		//get_title
		String actualTitleOfTheSite=driver.getTitle();
		//String titleOfThePage=driver.getTitle();
		System.out.println("The Title of the site is: "+ actualTitleOfTheSite);
		//Assert.assertEquals("My Stores", actualTitleOfTheSite);
		
		
		
		Thread.sleep(3000);
		Page_Object_Model user = new Page_Object_Model();
		
		//log_IN
		driver.findElement(By.id("UserName")).sendKeys(user.username);
		
		driver.findElement(By.id("Password")).sendKeys(user.password);
		
//		WebElement Password = driver.findElement(By.id("Password"));
//		Password.click();
//		Password.sendKeys("floydshoeb$");
		
//		if(Password.getText().contains("Invalid login or password."))
//	        System.out.println("Test passed but login failed.");
		
//		if(actualUrl.equalsIgnoreCase(expectedUrl))
//		{
//		System.out.println("Test passed");
//		}
//		else
//		{
//		System.out.println("Test failed");
//		}
//		
//		
		
		driver.findElement(By.className("col-xs-4")).click();
		
		
		Thread.sleep(2000); 
	
	
	}
}
