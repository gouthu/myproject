package p1;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dice 
{
	FirefoxDriver driver;
	public void open()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://dice.com");
	}
	public void search() throws Exception
	{
		String str;
		driver.findElement(By.id("search-field-keyword")).sendKeys("qa jobs");
		driver.findElement(By.id("search-field-location")).clear();
		driver.findElement(By.id("search-field-location")).sendKeys("New York, NY");
		driver.findElement(By.xpath("//*[@class='btn btn-primary btn-lg btn-block']")).click();
		Thread.sleep(5000);
		WebElement w=driver.findElement(By.xpath("//*[@id='search-results-control']/div/div"));
		List<WebElement> lst=w.findElements(By.tagName("a"));
		for(int i=0;i<lst.size();i++)
		{
			WebElement w1=driver.findElement(By.xpath("//*[@id='search-results-control']/div/div"));
			List<WebElement> lst1=w1.findElements(By.tagName("a"));
			
			if(lst1.get(i).getText().startsWith("QA"))
			{
			  driver.findElement(By.linkText(lst1.get(i).getText())).click();
			  Thread.sleep(5000);
			  str=driver.findElement(By.xpath("//*[contains(@id,'jobdescSec') or contains(@class,'job_description')]")).getText();
			  System.out.println(str);
			  driver.navigate().back();
			  Thread.sleep(5000);
			}
		}		
	}
	public static void main(String[] args) throws Exception
	{
		dice d=new dice();
		d.open();
		d.search();
		

	}

}
