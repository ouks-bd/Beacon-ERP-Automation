package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pom.Page_Object_Model;

public class SuplierInvoice extends driver {

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
		
		driver.get("http://test.beacontech.xyz/procurement/procurementpurchaseinvoiceslave");
		
		driver.findElement(By.id("txtSupplierInvoiceNo")).sendKeys("for test");
		
		
		WebElement paymentmethod = driver.findElement(By.id("ddlSupplierPaymentMethodEnumFK"));
		Select payment  =new Select(paymentmethod);
		payment.selectByValue("1");
		
		
		WebElement currency  = driver.findElement(By.id("ddlCurrencyFK"));
		Select currencytype  =new Select(currency);
		currencytype.selectByValue("2");
		
		WebElement supplierselect  = driver.findElement(By.id("ddlCommon_SupplierFK"));
		Select suppliername    =new Select(supplierselect);
		suppliername.selectByValue("1");
		
		Thread.sleep(5000);
		
}
}

	

