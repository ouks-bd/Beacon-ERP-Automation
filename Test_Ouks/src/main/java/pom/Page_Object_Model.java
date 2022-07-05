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
	
	public Page_Object_Model() {
		username="shoeb";
		password ="$$$$";
	}
	
	public void GetStyle() {
	    List<String> givenList = Arrays.asList("Baby Pyjama", "Men's Pyjama", "Boy's Shirt","Men's Shirt","boys knitted shirt");
	    Random rand = new Random();
	    StyleName  = givenList.get(rand.nextInt(givenList.size()));
	}
	
	
	
}

