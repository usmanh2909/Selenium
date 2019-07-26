package Selenium;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompltSpice {

	public static void main(String[] args) throws InterruptedException {

		// Scanner in = new Scanner(System.in);
		// System.out.println("Please enter no of passengers");
		// int n=in.nextInt();
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.get("https://www.spicejet.com/");
        //d.manage().timeouts().implicitlyWait(5,TimeUnit.MILLISECONDS);
		d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		d.findElement(By.xpath("//a[@value='HBX']")).click();
		// 3d.findElement(By.xpath("(//a[@value='BOM'])[2])")).click();
		d.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		d.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		// d.findElement(By.id("ctl00_mainContent_view_date2")).click();
		if (d.findElement(By.id("spclearDate")).getAttribute("class").contains("date-close")) {

			System.out.println("It is active");
		} else {

			System.out.println("it isnt active");
		}

		d.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(2000);
		for (int i = 0; i <= 3; i++) {
			d.findElement(By.id("hrefIncAdt")).click();
		}
		d.findElement(By.xpath("//input[@value='Done']")).click();
		// d.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		
		//WebDriverWait w = new WebDriverWait(d,20);
		//w.until(ExpectedConditions.elementToBeClickable(locator))
		Select s = new Select(d.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByVisibleText("USD");
		d.findElement(By.xpath("//input[@value='Search']")).click();
	}

}
