package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		d.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		System.out.println(d.switchTo().alert().getText());
		d.switchTo().alert().accept();

	}

}
