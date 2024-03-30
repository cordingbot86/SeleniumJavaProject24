package testcase08;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Program01 {

	public static void main(String[] args)  {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Documents\\seleniumsoftware\\chromedriver-win64\\chromedriver.exe" );
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();

		  WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
		  searchBox.sendKeys("iphone x");
		  //searchBox.submit();
		  driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		  driver.findElement(By.linkText("Apple iPhone 15 (128 GB) - Black")).click();
		  //Select quantity = new Select(driver.findElement(By.id("quantity")));
		  //quantity.selectByIndex(1);
		  
		  
		 

		 
		


	}

}
