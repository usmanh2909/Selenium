package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.makemytrip.com");
		d.findElement(By.xpath("//input[@id='fromCity']")).click();
		//Thread.sleep(1000);
		WebElement m =d.findElement(By.xpath("//input[@placeholder='From']"));
		//Thread.sleep(1000);
		//m.click();
		//Thread.sleep(1000);
		m.sendKeys("Mumbai");
		Thread.sleep(1000);
		m.sendKeys(Keys.ARROW_DOWN);
		m.sendKeys(Keys.ENTER);
		//Thread.sleep(2000);
		//m.click();
		Thread.sleep(2000);
		 m =d.findElement(By.xpath("//input[@placeholder='To']"));
		m.click();
		m.sendKeys("Del");
		//Thread.sleep(2000);
		m.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		m.sendKeys(Keys.ENTER);
		
	}

}
