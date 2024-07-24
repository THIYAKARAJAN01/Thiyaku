package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class incogntio {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://www.google.co.in");
		driver.navigate().back();
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		// TODO Auto-generated method stub

	}

}
