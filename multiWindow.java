package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://accounts.google.com/");
		d.findElement(By.linkText("Help")).click();
		Set<String> id = d.getWindowHandles();
		Iterator<String> it = id.iterator();
		String parentid=it.next();
		String childid = it.next();
		
		d.switchTo().window(childid);
		System.out.println(d.getTitle());

	}

}
