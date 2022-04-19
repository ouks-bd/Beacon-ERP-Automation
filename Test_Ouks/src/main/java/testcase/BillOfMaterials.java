package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pom.Page_Object_Model;

public class BillOfMaterials extends driver {
	
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
		
		driver.get("http://test.beacontech.xyz/Merchandising/StyleView/769");
		
		
		
		WebElement ItemFK_2 = driver.findElement(By.id("ItemFK_2"));
		Select BOM_Fabric  =new Select(ItemFK_2);
		BOM_Fabric.selectByValue("6904");
		BOM_Fabric.selectByValue("6905");
		Thread.sleep(2000);
		
		//selectByIndex(1);
		
		//BOM_Fabric_color_Common_ColorFK
		WebElement Fabric_colour = driver.findElement(By.id("Common_ColorFK"));
		Select BOM_Fabric_c  =new Select(Fabric_colour);
		BOM_Fabric_c.selectByValue("1");
		
		
		//driver.findElement(By.id("vmBOM.GSM")).clear();
	
		driver.findElement(By.xpath("//input[@name='vmBOM.GSM']")).sendKeys("160");
		Thread.sleep(2000);
		
		//driver.findElement(By.id("txt5")).sendKeys("500");
		
		//driver.findElement(By.id("vmBOM.Consumption")).clear();
		WebElement consumption=driver.findElement(By.name("vmBOM.Consumption"));
        consumption.sendKeys("500");
        
        //driver.findElement(By.id("vmBOM.ConRequiredQty")).clear();
        WebElement required_quantity=driver.findElement(By.name("vmBOM.ConRequiredQty"));
        required_quantity.sendKeys("5");
        
		WebElement tolerence=driver.findElement(By.name("vmBOM.Tolerance"));
        tolerence.sendKeys("0.1");
     
        //driver.findElement(By.id("vmBOM.UnitPrice")).clear();
        WebElement UnitPrice=driver.findElement(By.name("vmBOM.UnitPrice"));
        UnitPrice.sendKeys("10");
        
        
        driver.findElement(By.id("btnsave")).click();
        Thread.sleep(2000);
        
}
}