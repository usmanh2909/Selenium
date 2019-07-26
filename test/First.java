package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class First {
	
	
	@Test(groups= {"Smoke"})
	public void Demo(){
		
		System.out.println("hello");
	}
	
	@Test
	public void Demo1(){
		
		System.out.println("Bye");
		Assert.assertTrue(true);
	}

}

//