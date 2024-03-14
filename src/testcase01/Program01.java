package testcase01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program01 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Amitha");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Santhosh");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("123, Hmarveng, Bilkhawthlir, Kolasib, Mizoram 796081");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		
		
		
	}

}
