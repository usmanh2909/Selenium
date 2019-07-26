package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkCount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://qaclickacademy.com/practice.php");
		System.out.println(d.findElements(By.tagName("a")).size());
		
		WebElement footd = d.findElement(By.id("gf-BIG"));
		
		System.out.println(footd.findElements(By.tagName("a")).size());
		
		WebElement colm = d.findElement((By.xpath("//table/tbody/tr/td[1]/ul")));
		int s = colm.findElements(By.tagName("a")).size();
		System.out.println(s);
		
		for(int i=0;i<s;i++) {
			
			String clickOnTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			colm.findElements(By.tagName("a")).get(i).sendKeys(clickOnTab);
			Thread.sleep(2000);
		}
			Set<String> abc = d.getWindowHandles();
			Iterator<String> it = abc.iterator();
		while(it.hasNext())
		{
			System.out.println(d.switchTo().window(it.next()).getTitle());
			
		}
		

	}

}
