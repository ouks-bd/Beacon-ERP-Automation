package pom;


import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Page_Object_Model {
		
	public String username;
	public String password;
	public String StyleName;
	
	public Page_Object_Model() {
		username="shoeb";
		password ="f$";
	}
	
	public void GetStyle() {
	    List<String> givenList = Arrays.asList("Baby Pyjama", "Men's Pyjama", "Boy's Shirt","Men's Shirt","boys knitted shirt");
	    Random rand = new Random();
	    StyleName  = givenList.get(rand.nextInt(givenList.size()));
	}
	
	
	
}

