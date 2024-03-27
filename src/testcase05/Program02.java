package testcase05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Program02 {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new EdgeDriver();
		driver.get("https://chercher.tech/practice/table");
		getWebSiteDetils("google.com");

	}
	public static int webSiteRowNumber(String webSiteName) 
	{
		List<WebElement>siteList =driver.findElements(By.xpath("//table[@id='webtable'//td[1]"));
		int count=1;
		for (WebElement site:siteList)
		{
			if(webSiteName.equals(site.getText().trim()))
			{
				return count;
			}
			count++;
		}
		return 0;
	}
	public static void getWebSiteDetils(String webSiteName)
	{
		int row=webSiteRowNumber(webSiteName);
		List<WebElement>siteList =driver.findElements(By.xpath("//table[@id='webtable'//td["+row+"]"));

		for (WebElement site:siteList)
		{
			System.out.println(site.getText());
		}
		
	}


}
