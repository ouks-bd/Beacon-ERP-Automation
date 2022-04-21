package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pom.Page_Object_Model;

public class StyleCreate extends driver {
	
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
		
		driver.findElement(By.className("col-xs-4")).click();
		
		
		driver.get("http://test.beacontech.xyz/merchandising/order");
		driver.findElement(By.id("iconName")).click();
		
		
		WebElement element = driver.findElement(By.id("ddlBuyer"));
		Select select =new Select(element);
		select.selectByValue("3");

		driver.findElement(By.id("txt4")).sendKeys("PO21042022");
		driver.findElement(By.id("txt2")).clear();
		driver.findElement(By.id("txt2")).sendKeys("2022-04-03");
		driver.findElement(By.id("txt5")).sendKeys("2022");
		driver.findElement(By.id("Commission")).sendKeys("5");
		driver.findElement(By.id("txt6")).sendKeys("Automation");
		
		driver.findElement(By.id("btnsave")).click();
		 
		driver.findElement(By.xpath("(//a[starts-with(@href,'/Merchandising/OrderView/')])[1]")).click();
		
		driver.findElement(By.id("iconName")).click();
	
		user.GetStyle();
		driver.findElement(By.xpath("//input[@id='vmStyle_Style']")).sendKeys(user.StyleName);
		
		Thread.sleep(7000); 
		
		
}
}
