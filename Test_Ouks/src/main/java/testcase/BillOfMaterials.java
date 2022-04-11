package testcase;

import java.time.Duration;

import org.testng.annotations.Test;

public class BillOfMaterials extends driver {
	
String baseUrl="http://test.beacontech.xyz/";
	
	@Test
	public void locatorlearning() throws InterruptedException {
		
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		
		
}
}