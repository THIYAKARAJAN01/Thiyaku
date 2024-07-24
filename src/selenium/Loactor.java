package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loactor {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement emailfeild = driver.findElement(By.id("email"));
		emailfeild.sendKeys("thiyakus0@amil.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("thiyakus@11");
		
		driver.findElement(By.linkText("Forgotten password?"));
		
		
		
		// TODO Auto-generated method stub

	}

}
