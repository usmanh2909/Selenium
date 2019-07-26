package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chrome {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.get("https://google.com");
		
		Thread.sleep(2000);
		Robot robot = new Robot();
		
		 robot.keyPress(KeyEvent.VK_ALT);
		 Thread.sleep(2000);
		 
		 robot.keyRelease(KeyEvent.VK_ALT);
		 Thread.sleep(2000);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		 for(int l=0;l<13;l++) {
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(1000);
		 }
		 Thread.sleep(2000);
		 robot.keyRelease(KeyEvent.VK_DOWN);
		 Thread.sleep(2000);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		 for(int l=0;l<3;l++) {
			 robot.keyPress(KeyEvent.VK_DOWN);
			 Thread.sleep(1000);
			 }
		 robot.keyRelease(KeyEvent.VK_DOWN);
		 Thread.sleep(2000);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 
		 
		 
	}

}
