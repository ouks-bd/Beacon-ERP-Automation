package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pom.Page_Object_Model;

public class PurchaseRequisiotion extends driver {
	
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
	
	driver.get("http://test.beacontech.xyz/procurement/procurementstylepurchaserequisitionslave");
	
	driver.findElement(By.id("//input[@id='txtRequisitionDate']")).sendKeys("2022-04-03");
	
	WebElement PrType = driver.findElement(By.id("ddlProcurementOriginTypeEnumFK"));
	Select PrTypeBom  =new Select(PrType);
	PrTypeBom.selectByValue("2");
	
	WebElement PrType = driver.findElement(By.id("ddlMerchandisingStyleID"));
	Select PrTypeBom  =new Select(PrType);
	PrTypeBom.selectByValue("2");
	
	
	
	KIK/00015A/20/08/17/P121330/Baby Boy Knitted Set, Shirt+Trouser
	
	
}
}

