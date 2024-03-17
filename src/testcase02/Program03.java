package testcase02;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Program03 {
static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Amitha");
		screenShot("firstName");
		File srcFN=driver.findElement(By.xpath("//input[@placeholder='First Name']"))
		.getScreenshotAs(OutputType.FILE);
		File desFN=new File("./screenshort/firstNameElement.png");
		FileUtils.copyFile(srcFN,desFN);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Santhosh");
		screenShot("lastName");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("123, Hmarveng, Bilkhawthlir, Kolasib, Mizoram 796081");
		screenShot("adress");
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		screenShot("genter");
		}
	public static void screenShot(String fileName)throws IOException
	{

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("./screenshot/"+fileName+".png");
		FileUtils.copyFile(src, des);
	}
		

	}

