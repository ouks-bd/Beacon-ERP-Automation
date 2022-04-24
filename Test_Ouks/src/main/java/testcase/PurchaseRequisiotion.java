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
	
	driver.findElement(By.id("txtRequisitionDate")).sendKeys("2022-04-03");
	Thread.sleep(5000);
	
	WebElement PrOrigin = driver.findElement(By.id("ddlProcurementOriginTypeEnumFK"));
	Select PrTypeBom  =new Select(PrOrigin);
	PrTypeBom.selectByValue("2");
	Thread.sleep(5000);
	
	
	//WebElement PrType = driver.findElement(By.xpath("//*[@class=\"form-control ddlReset"]")); 
	//WebElement Pr = driver.findElement(By.className("form-control ddlReset"));
	WebElement Pr = driver.findElement(By.name("RequisitionTypeEnumFK"));
	Select PrTypeProcurement  =new Select(Pr);
	PrTypeProcurement.selectByValue("1");
	Thread.sleep(5000);
	
	
	WebElement PrStyle = driver.findElement(By.id("ddlMerchandisingStyleID"));
	Select PrStyleBom  =new Select(PrStyle);
	PrStyleBom.selectByVisibleText("KIK/00015A/20/08/17/P121330/Baby Boy Knitted Set, Shirt+Trouser");
	Thread.sleep(5000);
	
//	WebElement PrStyleSelect = driver.findElement(By.id("txtRequisitionQuantity_0"));
//	Select PrStyleSelectBom  =new Select(PrStyleSelect);
//	PrStyleSelectBom.selectByValue("0.00450");
	
	driver.findElement(By.id("select_all")).click();
//	driver.findElement(By.id("txtRequisitionQuantity_0"));
//	driver.findElement(By.id("DataListPartial_0__Flag"));
//	driver.findElement(By.id("DataListPartial_1__Flag"));
	
	
	
	Thread.sleep(5000);
	
		
}
}

