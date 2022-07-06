package pom;


import java.util.Arrays;
import java.util.List;
import java.util.Random;

import testcase.driver;

public class Page_Object_Model {
		
	public String username;
	public String password;
	public String StyleName;
	
	public String baseUrl="http://test.beacontech.xyz/";
	public String PoInvoice =this.baseUrl+"procurement/procurementpurchaseinvoicelist";
	
	public String BofLink = "http://test.beacontech.xyz/Merchandising/YarnCalculation/788";
	public String BomLink = "http://test.beacontech.xyz/Merchandising/StyleView/769";
	public String Order = "http://test.beacontech.xyz/merchandising/order";
	public String storein ="http://test.beacontech.xyz/warehouse/warehouseporeceivingslave";
	public String Pr ="http://test.beacontech.xyz/procurement/procurementpurchaserequisitionlist";
	public String Po="http://test.beacontech.xyz/procurement/procurementpurchaseorderlist";
	public String order ="http://test.beacontech.xyz/merchandising/order";
	public String CreateInvoice="http://test.beacontech.xyz/procurement/procurementpurchaseinvoiceslave";
	public String Invoice ="http://test.beacontech.xyz/procurement/procurementpurchaseinvoicelist";
	
	public Page_Object_Model() {
		username="shoeb";
		password ="floydshoeb$";
	}
	
	public void GetStyle() {
	    List<String> givenList = Arrays.asList("Baby Pyjama", "Men's Pyjama", "Boy's Shirt","Men's Shirt","boys knitted shirt");
	    Random rand = new Random();
	    StyleName  = givenList.get(rand.nextInt(givenList.size()));
	}
	
	
	
}

