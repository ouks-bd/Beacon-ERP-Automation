package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pom.Page_Object_Model;

public class PrPoList extends driver {
	
String baseUrl="http://test.beacontech.xyz/";
	
	@Test
	public void test () throws InterruptedException {
		
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	
		
		Page_Object_Model user = new Page_Object_Model();
		
		//log_IN
		driver.findElement(By.id("UserName")).sendKeys(user.username);
		
		driver.findElement(By.id("Password")).sendKeys(user.password);
		
		driver.findElement(By.className("col-xs-4")).click();
		
		driver.get("http://test.beacontech.xyz/Merchandising/OrderView/629");
		
		
		/** need to add prposelect id   */
		driver.get("http://test.beacontech.xyz/Merchandising/ProcuredStyle/796\"");

		
		Thread.sleep(5000);

}
}
