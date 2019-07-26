package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBut {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.echoecho.com/htmlforms10.htm");
		//d.findElement(By.xpath("//input[@value='Milk']")).click();
		int s =d.findElements(By.xpath("//input[@name='group1']")).size();
		for(int i=0;i<s;i++) {
			
			String at =d.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if(at.equals("Cheese")) {
				
				d.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}
		
	}

}
