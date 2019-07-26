package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.spicejet.com/");
		/*d.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		d.findElement(By.xpath("//a[@value='MAA']")).click();
		//Thread.sleep(2000);
		//d.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		//Thread.sleep(2000);
		d.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		d.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();*/
		
		//System.out.println(d.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).isEnabled());
		System.out.println(d.findElement(By.id("spclearDate")).getAttribute("class"));
		d.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(d.findElement(By.id("spclearDate")).getAttribute("class"));
		if(d.findElement(By.id("spclearDate")).getAttribute("class").contains("date-close")) {
			
			System.out.println("Its is active");
		}
		else
		{
			
			System.out.println("it isnt active");
		}
		
	}

}
