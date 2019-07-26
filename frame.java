package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://jqueryui.com/droppable/");
		d.switchTo().frame(d.findElement(By.className("demo-frame")));
		WebElement source = d.findElement(By.id("draggable"));
		WebElement target = d.findElement(By.id("droppable"));
		Actions a = new Actions(d);
		a.dragAndDrop(source, target).build().perform();
		d.switchTo().defaultContent();
		

	}

}
