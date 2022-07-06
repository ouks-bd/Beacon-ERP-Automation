package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pom.Page_Object_Model;

public class PrPoList extends driver {
	

	
	@Test
	public void test () throws InterruptedException {
		Page_Object_Model user = new Page_Object_Model();
		
		driver.get(user.baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	
		
		//log_IN
		driver.findElement(By.id("UserName")).sendKeys(user.username);
		
		driver.findElement(By.id("Password")).sendKeys(user.password);
		
		driver.findElement(By.className("col-xs-4")).click();
		
		driver.get(user.Pr);
		driver.get(user.Po);
		
		/** need to add prposelect id   */
		
		

		
		Thread.sleep(5000);

}
}
