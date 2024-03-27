package testcase05;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Program01 {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver =new EdgeDriver();
		driver.get("https://www.demo.guru99.com/test/web-table-element.php");
		//headerValidation()
		getcompanyName();
		
	}
	
	public static void getcompanyName() 
	{
		List<WebElement> companyList= driver.findElements(By.xpath("//table[@class='dataTable']//th"));
		List<String>companyNameList=new ArrayList<>();
		
		
		for(WebElement name:companyList)
		{
			companyNameList.add(name.getText());
		}
		System.out.println(companyNameList);
		
		
			
		
		}
	
	
		
	

}
