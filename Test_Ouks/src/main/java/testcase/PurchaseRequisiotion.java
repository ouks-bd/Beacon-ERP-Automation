package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pom.Page_Object_Model;

public class PurchaseRequisiotion extends driver {
	
	
	Page_Object_Model user=new Page_Object_Model();
	
	@Test
	public void locatorlearning() throws InterruptedException {
	
	driver.get(user.baseUrl);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();

	
	
	driver.findElement(By.id("UserName")).sendKeys(user.username);
	driver.findElement(By.id("Password")).sendKeys(user.password);
	driver.findElement(By.className("col-xs-4")).click();
	
	driver.get(user.PrCreate);
				
	
	driver.findElement(By.id("txtRequisitionDate")).sendKeys("2022-04-03");
	
	
	WebElement PrOrigin = driver.findElement(By.id("ddlProcurementOriginTypeEnumFK"));
	Select PrTypeBom  =new Select(PrOrigin);
	PrTypeBom.selectByValue("2");
	
	
	WebElement Pr = driver.findElement(By.name("RequisitionTypeEnumFK"));
	Select PrTypeProcurement  =new Select(Pr);
	PrTypeProcurement.selectByValue("1");
	
	
	WebElement PrStyle = driver.findElement(By.id("ddlMerchandisingStyleID"));
	Select PrStyleBom  =new Select(PrStyle);
	PrStyleBom.selectByVisibleText("KIK/00015A/20/08/17/P121330/Baby Boy Knitted Set, Shirt+Trouser");

	

	
	driver.findElement(By.id("select_all")).click();
	
	driver.findElement(By.id("btnsave")).click(); 
	
	Thread.sleep(5000);
	
	driver.get(user.Pr);
	
	
	WebElement checkbox = driver.findElement(By.linkText("Submit"));
    checkbox.click();
    
    //driver.findElement(By.id("btnsave")).click();
    driver.findElement(By.className("submitOrDraftText"));
    
    //need to input pr quantity also click submit button on the ongoing pr
			
	Thread.sleep(5000);
	
		
}
}

