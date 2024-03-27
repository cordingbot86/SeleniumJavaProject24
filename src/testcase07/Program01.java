package testcase07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Program01 {
static WebDriver driver;
	public static void main(String[] args) {
		driver=new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='SingleFrame.html']")));
		driver.findElement(By.xpath("//input[@tye='text']")).sendKeys("Test");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@hret='#Multiple']")).click();
		
		
	}

}
