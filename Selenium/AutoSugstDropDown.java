package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugstDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://ksrtc.in/oprs-web/");
		String text;
		d.findElement(By.id("fromPlaceName")).sendKeys("Beng");
		Thread.sleep(2000);
		//d.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		//d.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		JavascriptExecutor js =(JavascriptExecutor) d;
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		text =(String) js.executeScript(script);
		System.out.println(text);
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")){
			
			d.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			text =(String) js.executeScript(script);
			System.out.println(text);
		}
		
		
		
	}

}

//javascript Dom extract hidden element
//selenium can not identify hidden element
//Investigate properties of an object if it contains any hidden text