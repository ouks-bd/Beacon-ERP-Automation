package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pom.Page_Object_Model;

public class PurchaseOrder extends driver {
	
	
String baseUrl="http://test.beacontech.xyz/";
	
	@Test
	public void locatorlearning() throws InterruptedException {
	
	driver.get(baseUrl);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();

	
	Page_Object_Model user=new Page_Object_Model();
	driver.findElement(By.id("UserName")).sendKeys(user.username);
	driver.findElement(By.id("Password")).sendKeys(user.password);
	driver.findElement(By.className("col-xs-4")).click();
	
	
	driver.get("http://romo.beacontech.xyz/procurement/procurementpurchaseorderslave");
	Thread.sleep(5000);
	WebElement POOrigin = driver.findElement(By.id("ddlProcurementOriginTypeEnumFK"));
	Select PrTypeBom  =new Select(POOrigin);
	PrTypeBom.selectByValue("2");
	
	
	WebElement POType = driver.findElement(By.name("ddlPOTypeEnumFK"));
	Select PoTypeProcurement  =new Select(POType);
	PoTypeProcurement.selectByValue("1");
	
	Thread.sleep(5000);
	
	
}
}