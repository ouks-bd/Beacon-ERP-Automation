package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pom.Page_Object_Model;

public class BillOfFabrics extends driver {

	
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
		
		
		driver.get("http://test.beacontech.xyz/Merchandising/YarnCalculation/788");
		
		 WebElement Bof_Item = driver.findElement(By.id("ddlCommonRaw_FabricItemFK"));
			Select BOF_Fabric  =new Select(Bof_Item );
			BOF_Fabric.selectByValue("6904");
			
		
			WebElement Bof_color = driver.findElement(By.id("txtCommonColorFK"));
			Select BOF_Fabric_color  =new Select(Bof_color);
			BOF_Fabric_color.selectByValue("3");
			
			driver.findElement(By.id("txtConsumption")).clear();
			driver.findElement(By.id("txtConsumption")).sendKeys("0.62");
			
			driver.findElement(By.id("txtProcessLoss")).clear();
			driver.findElement(By.id("txtProcessLoss")).sendKeys("0");
			
			driver.findElement(By.id("txtProcessLossAOP")).clear();
			driver.findElement(By.id("txtProcessLossAOP")).sendKeys("0");
			
			driver.findElement(By.id("txtCombo")).clear();
			driver.findElement(By.id("txtCombo")).sendKeys("7");
	        Thread.sleep(9000);
	        
	        WebElement rawitem_bof   = driver.findElement(By.id("RawSubCategoryFK"));
			Select rawitem_list_bof  =new Select(rawitem_bof);
			rawitem_list_bof.selectByValue("2039");
	        
			//problem_in_count
			
			WebElement yarncount= driver.findElement(By.name("Raw_ItemFK"));
			//WebElement yarncount= driver.findElement(By.id("Raw_ItemFK"));
			Select yarncountitem =new Select(yarncount);
			yarncountitem.selectByValue("5252");
	        
			driver.findElement(By.id("txtPrice")).clear();
			driver.findElement(By.id("txtPrice")).sendKeys("0.98");
			
			
			WebElement currency= driver.findElement(By.id("ddlCommonCurrencyFK"));
			Select currency_value =new Select(currency);
			currency_value.selectByValue("1");
			
			driver.findElement(By.id("txtGSM")).clear();
			driver.findElement(By.id("txtGSM")).sendKeys("180");
			
			driver.findElement(By.id("txtLycra")).clear();
			driver.findElement(By.id("txtLycra")).sendKeys("2");
			
			
			WebElement yarntype= driver.findElement(By.id("YarnTypeFk"));
			Select type =new Select(yarntype);
			type.selectByValue("3");
			
			
			driver.findElement(By.id("txtFinishDIA")).clear();
			driver.findElement(By.id("txtFinishDIA")).sendKeys("20");
			Thread.sleep(5000);
			driver.findElement(By.id("btnsave")).click();
		
}
}
