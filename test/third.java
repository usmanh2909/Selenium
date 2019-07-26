package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class third {
	@Test(dataProvider="getdata")
public void WebloginCarloan(String user,String pass) {
		
		System.out.println("webloginCar");
		System.out.println(user);
		System.out.println(pass);
	}
	@Test(dependsOnMethods= {"WebloginCarloan"})
public void MobileloginCarloan() {
		
		System.out.println("MobileloginCar");
	}
	@Test(groups= {"Smoke"})
public void APILoginCarLoan() {
	
	System.out.println("LoginAPICar");
}
	
	@BeforeTest
	public void prerequisite() {
		
		System.out.println("I will execute first");
	}
	
	@BeforeSuite
	public void bfSuit() {
		
		System.out.println("I am no 1");
	}
	
	@DataProvider
	public Object[][] getdata() {
		
		Object[][] data = new Object[3][2];
		data[0][0]="Firstusername";
		data[0][1]="FirstPassword";
		data[1][0]="Secondusername";
		data[1][1]="SecondPassword";
		data[2][0]="Thirdusername";
		data[2][1]="ThirdPassword";
		return data;
	}

}
