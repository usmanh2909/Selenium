package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExercise {

	public static void main(String[] args) {
		int sum =0;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.cricbuzz.com/live-cricket-scorecard/21697/notts-vs-ham-county-div-1-county-championship-division-one-2019");
		WebElement table = d.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int r=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for(int i=0;i<=r-3;i++) {
			//System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
			String s = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int value = Integer.parseInt(s);
			sum = sum+value;
		}
		String ex=table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText(); //for extras
		int extra = Integer.parseInt(ex);
		int totalsum = sum+extra;
		System.out.println(totalsum);
		String s1=table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int total=Integer.parseInt(s1);
		System.out.println(total);
		if(totalsum==total) {
			
			System.out.println("Score is correct");
		}
	}

}
