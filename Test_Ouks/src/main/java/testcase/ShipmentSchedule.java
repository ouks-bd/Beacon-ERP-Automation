package testcase;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pom.Page_Object_Model;

public class ShipmentSchedule extends driver{
	
		
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
		
		driver.get("http://test.beacontech.xyz/Merchandising/StyleShipment/796");
		Thread.sleep(5000);
		driver.findElement(By.id("vmStyleSetPack_SetPackName")).sendKeys("Pant");
		driver.findElement(By.id("vmStyleSetPack_Quantity")).sendKeys("1");
		driver.findElement(By.id("btnsave"));
		
		
		WebElement country = driver.findElement(By.id("ddlCountryFK"));
		Select destination  =new Select(country);
		destination.selectByValue("2");
		
		WebElement port = driver.findElement(By.id("ddlPortFK"));
		Select destinationport  =new Select(port);
		destinationport.selectByValue("2");
		
		driver.findElement(By.id("vmShipmentSchedule_DestinationNo")).sendKeys("3489");
		
		//driver.findElement(By.id("ColorFK")).sendKeys("3489");
		
		Thread.sleep(5000);
}
}
