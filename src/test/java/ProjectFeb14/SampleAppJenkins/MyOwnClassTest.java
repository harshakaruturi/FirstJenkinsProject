package ProjectFeb14.SampleAppJenkins;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyOwnClassTest {

	@Before
	public void login(){
		System.out.println("Login Window of web");
	}
	
	@Test
	public void addToCart(){
		System.out.println("Add to shopping cart");
	}
	
	@After
	public void logout(){
		System.out.println("Logout window of the web");
	}
}
