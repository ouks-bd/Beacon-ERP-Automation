package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pom.Page_Object_Model;

public class PoReceving  extends driver{
	

	
	
	@Test
	public void locatorlearning() throws InterruptedException {
		
		Page_Object_Model user=new Page_Object_Model();
		
		
		driver.get(user.baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();


		
		driver.findElement(By.id("UserName")).sendKeys(user.username);
		driver.findElement(By.id("Password")).sendKeys(user.password);
		driver.findElement(By.className("col-xs-4")).click();
		
		driver.get(user.storein);
	
		
		driver.findElement(By.id("Challan")).sendKeys("Challan 02");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("txtPOCID")).sendKeys("PO2204-O-P000043");
		driver.findElement(By.id("txtPOCID")).click();
		Thread.sleep(5000);
		
		WebElement POOrigin = driver.findElement(By.id("txtPOCID"));
		Select PoTypeBom  =new Select(POOrigin);
		PoTypeBom.selectByValue("3156");
		
		
		
	
		Thread.sleep(5000);
		
		

}
}

