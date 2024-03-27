package testcase06;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program01 {
static WebDriver driver;
	public static void main(String[] args) {
		driver =new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java"+Keys.ENTER);
		driver.findElement(By.xpath("//div[@data-component-type='s-search-result']"+"//span[contains(text(),'Core Java: An Integrated '])[1]")).click();
		for(String id:driver.getWindowHandles())
				{
			driver.switchTo().window(id);
			if(driver.getCurrentUrl().contains("Core Java: An Integrated "))
			{
				Select qty=new Select(driver.findElement(By.name("quantity")));
				qty.selectByValue("6");
				driver.findElement(By.id("add-to-cart-button")).click();
			}
				}
	}
	

}
