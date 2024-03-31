package testcase08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program02 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Documents\\seleniumsoftware\\chromedriver-win64\\chromedriver.exe" );
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		  driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		  driver.findElement(By.xpath("//input[@name='customerName']")).sendKeys("Gopika");
		  driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("8542258686");
		  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("75@#hj");
		  


	}

}
