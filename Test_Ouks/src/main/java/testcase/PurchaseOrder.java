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
	
	driver.get("http://test.beacontech.xyz/procurement/procurementpurchaseorderslave");
	
	WebElement POOrigin = driver.findElement(By.id("ddlProcurementOriginTypeEnumFK"));
	Select PoTypeBom  =new Select(POOrigin);
	PoTypeBom.selectByValue("2");
	
	
	WebElement POtype = driver.findElement(By.id("ddlPOTypeEnumFK"));
	Select POTypeProcurement  =new Select(POtype);
	POTypeProcurement.selectByValue("1");
	
	driver.findElement(By.name("DeliveryDate")).sendKeys("2022-04-03");
	
	WebElement suplier = driver.findElement(By.id("ddlCommon_SupplierFK"));
	Select supliername =new Select(suplier);
	supliername.selectByValue("1");
	
	
	WebElement suplierpayment = driver.findElement(By.id("ddlSupplierPaymentMethodEnumFK"));
	Select suplierpay =new Select(suplierpayment);
	suplierpay.selectByValue("1");
	
	WebElement CurrencyFK = driver.findElement(By.id("ddlCommon_CurrencyFK"));
	Select Currency =new Select(CurrencyFK);
	Currency.selectByValue("1");
	
	driver.findElement(By.id("txtAttention")).sendKeys("ERP test");
	driver.findElement(By.id("txtDeliveryAddress")).sendKeys("Mouchak, Kalikoir, Gazipur-1751, Bangladesh");
	
	WebElement TermsAndCondition = driver.findElement(By.id("TermsAndConditionid"));
	Select TermsAndConditionid =new Select(TermsAndCondition);
	TermsAndConditionid.selectByValue("1");
	
	driver.findElement(By.id("ddlProcurement_PurchaseRequisitionFK"));
	
	WebElement PurchaseRequisitionDropdown = driver.findElement(By.name("Procurement_PurchaseRequisitionFK"));
	Select PurchaseRequisitionDropdownSelect =new Select(PurchaseRequisitionDropdown);
	PurchaseRequisitionDropdownSelect.selectByValue("2419");
	
	
	
	
	
	Thread.sleep(5000);
	
	
}
}