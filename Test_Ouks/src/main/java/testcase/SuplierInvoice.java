package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pom.Page_Object_Model;

public class SuplierInvoice extends driver {

	
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
		
		driver.get(user.CreateInvoice);
		
		driver.findElement(By.id("txtSupplierInvoiceNo")).sendKeys("for test");
		
		
		WebElement paymentmethod = driver.findElement(By.id("ddlSupplierPaymentMethodEnumFK"));
		Select payment  =new Select(paymentmethod);
		payment.selectByValue("1");
		Thread.sleep(5000);
		
		WebElement currency  = driver.findElement(By.id("ddlCurrencyFK"));
		Select currencytype  =new Select(currency);
		currencytype.selectByValue("2");
		Thread.sleep(5000);
		
		WebElement supplierselect  = driver.findElement(By.id("ddlCommon_SupplierFK"));
		Select suppliername    =new Select(supplierselect);
		suppliername.selectByValue("1");
		Thread.sleep(5000);
		
		WebElement ponumber  = driver.findElement(By.id("ddlProcurementPurchaseOrderFK"));
		Select selectnumber    =new Select(ponumber);
		selectnumber.selectByValue("3117");
		Thread.sleep(5000);
		
		driver.findElement(By.id("DataListPartial_0__InvoiceQuantity")).clear();
		driver.findElement(By.id("DataListPartial_0__InvoiceQuantity")).sendKeys("1");
		
		
		driver.findElement(By.id("DataListPartial_0__Flag")).click();
		
		driver.findElement(By.id("btnsave")).click();
		
		
		driver.get(user.Invoice);
		
		
		//need to submit the invoice
		//a[@id='2862']//i[contains(text(),'Submit')]
		
		driver.findElement(By.id("2862")).click();
		
		
		
		Thread.sleep(5000);
		
}
}

	

