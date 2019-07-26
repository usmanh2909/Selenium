package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynCalender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.path2usa.com/travel-companions");
		
		d.findElement(By.xpath("//input[@id='travel_date']")).click();
		
		while(!d.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("September")) {
			
			d.findElement(By.cssSelector("[class='datepicker-days'] [class='next'] ")).click();
		}
		List<WebElement> dates=d.findElements(By.className("day"));
		int count=d.findElements(By.className("day")).size();
		
		for(int i=0;i<=count;i++) {
			String s=d.findElements(By.className("day")).get(i).getText();
			if(s.equalsIgnoreCase("21")) {
				
				d.findElements(By.className("day")).get(i).click();
				break;
			}
		}

	}

}
