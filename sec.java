package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class sec {
	@Parameters({"URL"})
	@Test
	public void WebloginHomeloan(String urllink) {
		
		System.out.println("webloginhome");
		System.out.println(urllink);
	}
	@Test
public void Mobileloginhomeloan() {
		
		System.out.println("Mobileloginhome");
	}
	@Test(groups= {"Smoke"})
public void LoginAPIHomeLoan() {
	
	System.out.println("LoginAPIHome");
	
}
	@BeforeMethod
	public void beforevery() {
		
		System.out.println("I am there before every method");
	}

}
